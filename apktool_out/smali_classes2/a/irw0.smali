.class public abstract La/irw0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/h7x0;

.field public static final b:La/l5x0;

.field public static final c:La/yqw0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, La/cpw0;

    .line 2
    .line 3
    const/4 v1, 0x7

    .line 4
    invoke-direct {v0, v1}, La/cpw0;-><init>(B)V

    .line 5
    .line 6
    .line 7
    new-instance v1, La/h7x0;

    .line 8
    .line 9
    const-class v2, La/crw0;

    .line 10
    .line 11
    const-class v3, La/tmw0;

    .line 12
    .line 13
    invoke-direct {v1, v2, v3, v0}, La/h7x0;-><init>(Ljava/lang/Class;Ljava/lang/Class;La/c7x0;)V

    .line 14
    .line 15
    .line 16
    sput-object v1, La/irw0;->a:La/h7x0;

    .line 17
    .line 18
    invoke-static {}, La/vax0;->A()La/alw0;

    .line 19
    .line 20
    .line 21
    new-instance v0, La/l5x0;

    .line 22
    .line 23
    const/4 v1, 0x2

    .line 24
    const-string v2, "type.googleapis.com/google.crypto.tink.AesEaxKey"

    .line 25
    .line 26
    invoke-direct {v0, v1, v3, v2}, La/l5x0;-><init>(ILjava/lang/Class;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    sput-object v0, La/irw0;->b:La/l5x0;

    .line 30
    .line 31
    new-instance v0, La/yqw0;

    .line 32
    .line 33
    const/4 v1, 0x1

    .line 34
    invoke-direct {v0, v1}, La/yqw0;-><init>(B)V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/irw0;->c:La/yqw0;

    .line 38
    .line 39
    return-void
.end method
