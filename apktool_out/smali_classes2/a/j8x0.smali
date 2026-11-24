.class public abstract La/j8x0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/h7x0;

.field public static final b:La/h7x0;

.field public static final c:La/l5x0;

.field public static final d:La/zqw0;

.field public static final e:La/yqw0;

.field public static final f:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, La/o6x0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, La/h7x0;

    .line 7
    .line 8
    const-class v2, La/h8x0;

    .line 9
    .line 10
    const-class v3, La/f9x0;

    .line 11
    .line 12
    invoke-direct {v1, v2, v3, v0}, La/h7x0;-><init>(Ljava/lang/Class;Ljava/lang/Class;La/c7x0;)V

    .line 13
    .line 14
    .line 15
    sput-object v1, La/j8x0;->a:La/h7x0;

    .line 16
    .line 17
    new-instance v0, La/m8x0;

    .line 18
    .line 19
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    new-instance v1, La/h7x0;

    .line 23
    .line 24
    const-class v3, La/xow0;

    .line 25
    .line 26
    invoke-direct {v1, v2, v3, v0}, La/h7x0;-><init>(Ljava/lang/Class;Ljava/lang/Class;La/c7x0;)V

    .line 27
    .line 28
    .line 29
    sput-object v1, La/j8x0;->b:La/h7x0;

    .line 30
    .line 31
    invoke-static {}, La/ldx0;->t()La/alw0;

    .line 32
    .line 33
    .line 34
    new-instance v0, La/l5x0;

    .line 35
    .line 36
    const/4 v1, 0x2

    .line 37
    const-string v2, "type.googleapis.com/google.crypto.tink.HmacKey"

    .line 38
    .line 39
    invoke-direct {v0, v1, v3, v2}, La/l5x0;-><init>(ILjava/lang/Class;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    sput-object v0, La/j8x0;->c:La/l5x0;

    .line 43
    .line 44
    new-instance v0, La/zqw0;

    .line 45
    .line 46
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 47
    .line 48
    .line 49
    sput-object v0, La/j8x0;->d:La/zqw0;

    .line 50
    .line 51
    new-instance v0, La/yqw0;

    .line 52
    .line 53
    const/16 v2, 0xe

    .line 54
    .line 55
    invoke-direct {v0, v2}, La/yqw0;-><init>(B)V

    .line 56
    .line 57
    .line 58
    sput-object v0, La/j8x0;->e:La/yqw0;

    .line 59
    .line 60
    sput v1, La/j8x0;->f:I

    .line 61
    .line 62
    return-void
.end method
