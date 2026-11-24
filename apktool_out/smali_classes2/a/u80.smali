.class public final La/u80;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime La/ahi0;
.end annotation


# static fields
.field public static final Companion:La/t80;

.field public static final g:[La/a8z;


# instance fields
.field public final a:Ljava/util/List;

.field public final b:Ljava/lang/Double;

.field public final c:La/bg8;

.field public final d:J

.field public final e:Ljava/lang/String;

.field public final f:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, La/t80;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/u80;->Companion:La/t80;

    .line 7
    .line 8
    sget-object v0, La/wez;->a:La/wez;

    .line 9
    .line 10
    new-instance v1, La/q8;

    .line 11
    .line 12
    const/16 v2, 0x15

    .line 13
    .line 14
    invoke-direct {v1, v2}, La/q8;-><init>(B)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const/4 v1, 0x6

    .line 22
    new-array v1, v1, [La/a8z;

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    aput-object v0, v1, v2

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    const/4 v2, 0x0

    .line 29
    aput-object v2, v1, v0

    .line 30
    .line 31
    const/4 v0, 0x2

    .line 32
    aput-object v2, v1, v0

    .line 33
    .line 34
    const/4 v0, 0x3

    .line 35
    aput-object v2, v1, v0

    .line 36
    .line 37
    const/4 v0, 0x4

    .line 38
    aput-object v2, v1, v0

    .line 39
    .line 40
    const/4 v0, 0x5

    .line 41
    aput-object v2, v1, v0

    .line 42
    .line 43
    sput-object v1, La/u80;->g:[La/a8z;

    .line 44
    .line 45
    return-void
.end method

.method public synthetic constructor <init>(IIJLa/bg8;Ljava/lang/Double;Ljava/lang/String;Ljava/util/List;)V
    .locals 3

    .line 1
    and-int/lit8 v0, p1, 0x39

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/16 v2, 0x39

    .line 5
    .line 6
    if-ne v2, v0, :cond_2

    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p8, p0, La/u80;->a:Ljava/util/List;

    .line 12
    .line 13
    and-int/lit8 p8, p1, 0x2

    .line 14
    .line 15
    if-nez p8, :cond_0

    .line 16
    .line 17
    iput-object v1, p0, La/u80;->b:Ljava/lang/Double;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    iput-object p6, p0, La/u80;->b:Ljava/lang/Double;

    .line 21
    .line 22
    :goto_0
    and-int/lit8 p1, p1, 0x4

    .line 23
    .line 24
    if-nez p1, :cond_1

    .line 25
    .line 26
    iput-object v1, p0, La/u80;->c:La/bg8;

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    iput-object p5, p0, La/u80;->c:La/bg8;

    .line 30
    .line 31
    :goto_1
    iput-wide p3, p0, La/u80;->d:J

    .line 32
    .line 33
    iput-object p7, p0, La/u80;->e:Ljava/lang/String;

    .line 34
    .line 35
    iput p2, p0, La/u80;->f:I

    .line 36
    .line 37
    return-void

    .line 38
    :cond_2
    sget-object p0, La/s80;->a:La/s80;

    .line 39
    .line 40
    invoke-virtual {p0}, La/s80;->getDescriptor()La/ugi0;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-static {p1, v2, p0}, La/m2x;->I(IILa/ugi0;)V

    .line 45
    .line 46
    .line 47
    throw v1
.end method

.method public constructor <init>(Ljava/util/ArrayList;La/bg8;JLjava/lang/String;)V
    .locals 0

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    iput-object p1, p0, La/u80;->a:Ljava/util/List;

    const/4 p1, 0x0

    .line 50
    iput-object p1, p0, La/u80;->b:Ljava/lang/Double;

    .line 51
    iput-object p2, p0, La/u80;->c:La/bg8;

    .line 52
    iput-wide p3, p0, La/u80;->d:J

    .line 53
    iput-object p5, p0, La/u80;->e:Ljava/lang/String;

    const/16 p1, 0x16

    .line 54
    iput p1, p0, La/u80;->f:I

    return-void
.end method
