import picocli.CommandLine;
import picocli.CommandLine.Command;

@Command(
    name = "saasquatch cli",
    mixinStandardHelpOptions = true,
    version = "saasquatch-cli 1.0",
    description = "CLI for SaaSquatch application"
)
public class SaasquatchCli implements Runnable {

    @Override
    public void run() {
        System.out.println("SaaSquatch");
    }

    public static void main(String[] args) {
        int exitCode = new CommandLine(new SaasquatchCli()).execute(args);
        System.exit(exitCode);
    }
}
