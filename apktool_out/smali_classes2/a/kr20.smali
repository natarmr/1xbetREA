.class public abstract La/kr20;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/peg0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    :try_start_0
    sget-object v0, La/w8m0;->b:La/w8m0;

    .line 2
    .line 3
    iget-object v0, v0, La/w8m0;->a:La/peg0;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :catch_0
    :try_start_1
    sget-object v0, La/w8m0;->b:La/w8m0;

    .line 7
    .line 8
    iget-object v0, v0, La/w8m0;->a:La/peg0;

    .line 9
    .line 10
    :goto_0
    sput-object v0, La/kr20;->a:La/peg0;
    :try_end_1
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 11
    .line 12
    goto :goto_1

    .line 13
    :catch_1
    move-exception v0

    .line 14
    const-string v1, "Unexpected failure while binding MarkerFactory"

    .line 15
    .line 16
    invoke-static {v1, v0}, La/lvm0;->n(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 17
    .line 18
    .line 19
    goto :goto_1

    .line 20
    :catch_2
    new-instance v0, La/peg0;

    .line 21
    .line 22
    const/16 v1, 0xe

    .line 23
    .line 24
    invoke-direct {v0, v1}, La/peg0;-><init>(B)V

    .line 25
    .line 26
    .line 27
    sput-object v0, La/kr20;->a:La/peg0;

    .line 28
    .line 29
    :goto_1
    return-void
.end method
