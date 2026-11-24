.class public abstract La/b8x0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/yqw0;

.field public static final b:La/h7x0;

.field public static final c:La/h7x0;

.field public static final d:La/l5x0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, La/yqw0;

    .line 2
    .line 3
    const/16 v1, 0xd

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/yqw0;-><init>(B)V

    .line 6
    .line 7
    .line 8
    sput-object v0, La/b8x0;->a:La/yqw0;

    .line 9
    .line 10
    new-instance v0, La/d8x0;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 13
    .line 14
    .line 15
    new-instance v1, La/h7x0;

    .line 16
    .line 17
    const-class v2, La/v7x0;

    .line 18
    .line 19
    const-class v3, La/f9x0;

    .line 20
    .line 21
    invoke-direct {v1, v2, v3, v0}, La/h7x0;-><init>(Ljava/lang/Class;Ljava/lang/Class;La/c7x0;)V

    .line 22
    .line 23
    .line 24
    sput-object v1, La/b8x0;->b:La/h7x0;

    .line 25
    .line 26
    new-instance v0, La/c8x0;

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-direct {v0, v1}, La/c8x0;-><init>(B)V

    .line 30
    .line 31
    .line 32
    new-instance v1, La/h7x0;

    .line 33
    .line 34
    const-class v3, La/xow0;

    .line 35
    .line 36
    invoke-direct {v1, v2, v3, v0}, La/h7x0;-><init>(Ljava/lang/Class;Ljava/lang/Class;La/c7x0;)V

    .line 37
    .line 38
    .line 39
    sput-object v1, La/b8x0;->c:La/h7x0;

    .line 40
    .line 41
    invoke-static {}, La/x9x0;->A()La/alw0;

    .line 42
    .line 43
    .line 44
    new-instance v0, La/l5x0;

    .line 45
    .line 46
    const/4 v1, 0x2

    .line 47
    const-string v2, "type.googleapis.com/google.crypto.tink.AesCmacKey"

    .line 48
    .line 49
    invoke-direct {v0, v1, v3, v2}, La/l5x0;-><init>(ILjava/lang/Class;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    sput-object v0, La/b8x0;->d:La/l5x0;

    .line 53
    .line 54
    return-void
.end method
