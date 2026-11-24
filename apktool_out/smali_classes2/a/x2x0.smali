.class public abstract La/x2x0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/h7x0;

.field public static final b:La/h7x0;

.field public static final c:La/q5x0;

.field public static final d:La/l5x0;

.field public static final e:La/yqw0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/tow0;

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/tow0;-><init>(B)V

    .line 6
    .line 7
    .line 8
    new-instance v1, La/h7x0;

    .line 9
    .line 10
    const-class v2, La/g0x0;

    .line 11
    .line 12
    const-class v3, La/dnw0;

    .line 13
    .line 14
    invoke-direct {v1, v2, v3, v0}, La/h7x0;-><init>(Ljava/lang/Class;Ljava/lang/Class;La/c7x0;)V

    .line 15
    .line 16
    .line 17
    sput-object v1, La/x2x0;->a:La/h7x0;

    .line 18
    .line 19
    new-instance v0, La/qow0;

    .line 20
    .line 21
    const/16 v1, 0x1d

    .line 22
    .line 23
    invoke-direct {v0, v1}, La/qow0;-><init>(B)V

    .line 24
    .line 25
    .line 26
    new-instance v1, La/h7x0;

    .line 27
    .line 28
    const-class v2, La/q0x0;

    .line 29
    .line 30
    const-class v4, La/cnw0;

    .line 31
    .line 32
    invoke-direct {v1, v2, v4, v0}, La/h7x0;-><init>(Ljava/lang/Class;Ljava/lang/Class;La/c7x0;)V

    .line 33
    .line 34
    .line 35
    sput-object v1, La/x2x0;->b:La/h7x0;

    .line 36
    .line 37
    invoke-static {}, La/qex0;->B()La/alw0;

    .line 38
    .line 39
    .line 40
    new-instance v0, La/q5x0;

    .line 41
    .line 42
    const/4 v1, 0x3

    .line 43
    const-string v2, "type.googleapis.com/google.crypto.tink.HpkePrivateKey"

    .line 44
    .line 45
    invoke-direct {v0, v1, v3, v2}, La/l5x0;-><init>(ILjava/lang/Class;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    sput-object v0, La/x2x0;->c:La/q5x0;

    .line 49
    .line 50
    invoke-static {}, La/tex0;->t()La/alw0;

    .line 51
    .line 52
    .line 53
    new-instance v0, La/l5x0;

    .line 54
    .line 55
    const/4 v1, 0x4

    .line 56
    const-string v2, "type.googleapis.com/google.crypto.tink.HpkePublicKey"

    .line 57
    .line 58
    invoke-direct {v0, v1, v4, v2}, La/l5x0;-><init>(ILjava/lang/Class;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    sput-object v0, La/x2x0;->d:La/l5x0;

    .line 62
    .line 63
    new-instance v0, La/yqw0;

    .line 64
    .line 65
    const/16 v1, 0xb

    .line 66
    .line 67
    invoke-direct {v0, v1}, La/yqw0;-><init>(B)V

    .line 68
    .line 69
    .line 70
    sput-object v0, La/x2x0;->e:La/yqw0;

    .line 71
    .line 72
    return-void
.end method
