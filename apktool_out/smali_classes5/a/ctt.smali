.class public final La/ctt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime La/ahi0;
.end annotation


# static fields
.field public static final Companion:La/btt;

.field public static final e:[La/a8z;


# instance fields
.field public final a:I

.field public final b:Ljava/lang/Long;

.field public final c:Ljava/util/List;

.field public final d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, La/btt;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/ctt;->Companion:La/btt;

    .line 7
    .line 8
    sget-object v0, La/wez;->a:La/wez;

    .line 9
    .line 10
    new-instance v1, La/tet;

    .line 11
    .line 12
    const/16 v2, 0x15

    .line 13
    .line 14
    invoke-direct {v1, v2}, La/tet;-><init>(B)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const/4 v1, 0x4

    .line 22
    new-array v1, v1, [La/a8z;

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    const/4 v3, 0x0

    .line 26
    aput-object v3, v1, v2

    .line 27
    .line 28
    const/4 v2, 0x1

    .line 29
    aput-object v3, v1, v2

    .line 30
    .line 31
    const/4 v2, 0x2

    .line 32
    aput-object v0, v1, v2

    .line 33
    .line 34
    const/4 v0, 0x3

    .line 35
    aput-object v3, v1, v0

    .line 36
    .line 37
    sput-object v1, La/ctt;->e:[La/a8z;

    .line 38
    .line 39
    return-void
.end method

.method public synthetic constructor <init>(IILjava/lang/Long;Ljava/util/List;Z)V
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
    iput p2, p0, La/ctt;->a:I

    .line 11
    .line 12
    iput-object p3, p0, La/ctt;->b:Ljava/lang/Long;

    .line 13
    .line 14
    iput-object p4, p0, La/ctt;->c:Ljava/util/List;

    .line 15
    .line 16
    iput-boolean p5, p0, La/ctt;->d:Z

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    sget-object p0, La/att;->a:La/att;

    .line 20
    .line 21
    invoke-virtual {p0}, La/att;->getDescriptor()La/ugi0;

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

.method public constructor <init>(ILjava/lang/Long;Ljava/util/List;)V
    .locals 0

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput p1, p0, La/ctt;->a:I

    .line 32
    iput-object p2, p0, La/ctt;->b:Ljava/lang/Long;

    .line 33
    iput-object p3, p0, La/ctt;->c:Ljava/util/List;

    const/4 p1, 0x1

    .line 34
    iput-boolean p1, p0, La/ctt;->d:Z

    return-void
.end method
