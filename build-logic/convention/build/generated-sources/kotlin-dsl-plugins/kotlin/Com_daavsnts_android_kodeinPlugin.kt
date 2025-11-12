/**
 * Precompiled [com.daavsnts.android.kodein.gradle.kts][Com_daavsnts_android_kodein_gradle] script plugin.
 *
 * @see Com_daavsnts_android_kodein_gradle
 */
public
class Com_daavsnts_android_kodeinPlugin : org.gradle.api.Plugin<org.gradle.api.Project> {
    override fun apply(target: org.gradle.api.Project) {
        try {
            Class
                .forName("Com_daavsnts_android_kodein_gradle")
                .getDeclaredConstructor(org.gradle.api.Project::class.java, org.gradle.api.Project::class.java)
                .newInstance(target, target)
        } catch (e: java.lang.reflect.InvocationTargetException) {
            throw e.targetException
        }
    }
}
