.class public abstract La/wqw0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/h7x0;

.field public static final b:La/l5x0;

.field public static final c:La/zqw0;

.field public static final d:La/yqw0;

.field public static final e:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, La/tow0;

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    invoke-direct {v0, v1}, La/tow0;-><init>(B)V

    .line 5
    .line 6
    .line 7
    new-instance v1, La/h7x0;

    .line 8
    .line 9
    const-class v2, La/uqw0;

    .line 10
    .line 11
    const-class v3, La/tmw0;

    .line 12
    .line 13
    invoke-direct {v1, v2, v3, v0}, La/h7x0;-><init>(Ljava/lang/Class;Ljava/lang/Class;La/c7x0;)V

    .line 14
    .line 15
    .line 16
    sput-object v1, La/wqw0;->a:La/h7x0;

    .line 17
    .line 18
    invoke-static {}, La/gax0;->A()La/alw0;

    .line 19
    .line 20
    .line 21
    new-instance v0, La/l5x0;

    .line 22
    .line 23
    const/4 v1, 0x2

    .line 24
    const-string v2, "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey"

    .line 25
    .line 26
    invoke-direct {v0, v1, v3, v2}, La/l5x0;-><init>(ILjava/lang/Class;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    sput-object v0, La/wqw0;->b:La/l5x0;

    .line 30
    .line 31
    new-instance v0, La/zqw0;

    .line 32
    .line 33
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 34
    .line 35
    .line 36
    sput-object v0, La/wqw0;->c:La/zqw0;

    .line 37
    .line 38
    new-instance v0, La/yqw0;

    .line 39
    .line 40
    const/4 v2, 0x0

    .line 41
    invoke-direct {v0, v2}, La/yqw0;-><init>(B)V

    .line 42
    .line 43
    .line 44
    sput-object v0, La/wqw0;->d:La/yqw0;

    .line 45
    .line 46
    sput v1, La/wqw0;->e:I

    .line 47
    .line 48
    return-void
.end method
