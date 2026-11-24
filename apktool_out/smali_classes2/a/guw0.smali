.class public abstract La/guw0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/h7x0;

.field public static final b:La/l5x0;

.field public static final c:La/zqw0;

.field public static final d:La/yqw0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, La/tow0;

    .line 2
    .line 3
    const/16 v1, 0x12

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/tow0;-><init>(B)V

    .line 6
    .line 7
    .line 8
    new-instance v1, La/h7x0;

    .line 9
    .line 10
    const-class v2, La/cuw0;

    .line 11
    .line 12
    const-class v3, La/tmw0;

    .line 13
    .line 14
    invoke-direct {v1, v2, v3, v0}, La/h7x0;-><init>(Ljava/lang/Class;Ljava/lang/Class;La/c7x0;)V

    .line 15
    .line 16
    .line 17
    sput-object v1, La/guw0;->a:La/h7x0;

    .line 18
    .line 19
    invoke-static {}, La/jhx0;->y()La/alw0;

    .line 20
    .line 21
    .line 22
    new-instance v0, La/l5x0;

    .line 23
    .line 24
    const/4 v1, 0x2

    .line 25
    const-string v2, "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key"

    .line 26
    .line 27
    invoke-direct {v0, v1, v3, v2}, La/l5x0;-><init>(ILjava/lang/Class;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    sput-object v0, La/guw0;->b:La/l5x0;

    .line 31
    .line 32
    new-instance v0, La/zqw0;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/guw0;->c:La/zqw0;

    .line 38
    .line 39
    new-instance v0, La/yqw0;

    .line 40
    .line 41
    const/16 v1, 0x8

    .line 42
    .line 43
    invoke-direct {v0, v1}, La/yqw0;-><init>(B)V

    .line 44
    .line 45
    .line 46
    sput-object v0, La/guw0;->d:La/yqw0;

    .line 47
    .line 48
    return-void
.end method
