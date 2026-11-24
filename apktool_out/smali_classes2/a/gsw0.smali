.class public abstract La/gsw0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/l5x0;

.field public static final b:La/yqw0;

.field public static final c:La/h7x0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    invoke-static {}, La/kgx0;->y()La/alw0;

    .line 2
    .line 3
    .line 4
    new-instance v0, La/l5x0;

    .line 5
    .line 6
    const/4 v1, 0x2

    .line 7
    const-class v2, La/tmw0;

    .line 8
    .line 9
    const-string v3, "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey"

    .line 10
    .line 11
    invoke-direct {v0, v1, v2, v3}, La/l5x0;-><init>(ILjava/lang/Class;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    sput-object v0, La/gsw0;->a:La/l5x0;

    .line 15
    .line 16
    new-instance v0, La/yqw0;

    .line 17
    .line 18
    const/4 v1, 0x6

    .line 19
    invoke-direct {v0, v1}, La/yqw0;-><init>(B)V

    .line 20
    .line 21
    .line 22
    sput-object v0, La/gsw0;->b:La/yqw0;

    .line 23
    .line 24
    new-instance v0, La/epw0;

    .line 25
    .line 26
    const/16 v1, 0xd

    .line 27
    .line 28
    invoke-direct {v0, v1}, La/epw0;-><init>(B)V

    .line 29
    .line 30
    .line 31
    new-instance v1, La/h7x0;

    .line 32
    .line 33
    const-class v3, La/usw0;

    .line 34
    .line 35
    invoke-direct {v1, v3, v2, v0}, La/h7x0;-><init>(Ljava/lang/Class;Ljava/lang/Class;La/c7x0;)V

    .line 36
    .line 37
    .line 38
    sput-object v1, La/gsw0;->c:La/h7x0;

    .line 39
    .line 40
    return-void
.end method
