.class public final La/ztn;
.super La/ihy;
.source "SourceFile"


# static fields
.field public static final b:La/ztn;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, La/ztn;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/ztn;->b:La/ztn;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final j()Ljava/lang/Class;
    .locals 1

    .line 1
    new-instance p0, La/poe;

    .line 2
    .line 3
    const-string v0, "Introspecting local functions, lambdas, anonymous functions, local variables and typealiases is not yet fully supported in Kotlin reflection"

    .line 4
    .line 5
    invoke-direct {p0, v0}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method
