.class public final La/mro;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime La/ahi0;
.end annotation


# static fields
.field public static final Companion:La/zqo;

.field public static final e:[La/a8z;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:I

.field public final c:Ljava/util/List;

.field public final d:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/zqo;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/mro;->Companion:La/zqo;

    .line 7
    .line 8
    sget-object v0, La/wez;->a:La/wez;

    .line 9
    .line 10
    new-instance v1, La/ago;

    .line 11
    .line 12
    const/16 v2, 0x12

    .line 13
    .line 14
    invoke-direct {v1, v2}, La/ago;-><init>(B)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    new-instance v2, La/ago;

    .line 22
    .line 23
    const/16 v3, 0x13

    .line 24
    .line 25
    invoke-direct {v2, v3}, La/ago;-><init>(B)V

    .line 26
    .line 27
    .line 28
    invoke-static {v0, v2}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    const/4 v2, 0x4

    .line 33
    new-array v2, v2, [La/a8z;

    .line 34
    .line 35
    const/4 v3, 0x0

    .line 36
    const/4 v4, 0x0

    .line 37
    aput-object v4, v2, v3

    .line 38
    .line 39
    const/4 v3, 0x1

    .line 40
    aput-object v4, v2, v3

    .line 41
    .line 42
    const/4 v3, 0x2

    .line 43
    aput-object v1, v2, v3

    .line 44
    .line 45
    const/4 v1, 0x3

    .line 46
    aput-object v0, v2, v1

    .line 47
    .line 48
    sput-object v2, La/mro;->e:[La/a8z;

    .line 49
    .line 50
    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;ILjava/util/List;Ljava/util/List;)V
    .locals 2

    .line 1
    and-int/lit8 v0, p1, 0xf

    .line 2
    .line 3
    const/16 v1, 0xf

    .line 4
    .line 5
    if-ne v1, v0, :cond_0

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p2, p0, La/mro;->a:Ljava/lang/String;

    .line 11
    .line 12
    iput p3, p0, La/mro;->b:I

    .line 13
    .line 14
    iput-object p4, p0, La/mro;->c:Ljava/util/List;

    .line 15
    .line 16
    iput-object p5, p0, La/mro;->d:Ljava/util/List;

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    sget-object p0, La/yqo;->a:La/yqo;

    .line 20
    .line 21
    invoke-virtual {p0}, La/yqo;->getDescriptor()La/ugi0;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-static {p1, v1, p0}, La/m2x;->I(IILa/ugi0;)V

    .line 26
    .line 27
    .line 28
    const/4 p0, 0x0

    .line 29
    throw p0
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V
    .locals 0

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object p1, p0, La/mro;->a:Ljava/lang/String;

    const/4 p1, 0x1

    .line 32
    iput p1, p0, La/mro;->b:I

    .line 33
    iput-object p2, p0, La/mro;->c:Ljava/util/List;

    .line 34
    iput-object p3, p0, La/mro;->d:Ljava/util/List;

    return-void
.end method
