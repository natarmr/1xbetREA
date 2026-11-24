.class public final synthetic La/djs;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:J

.field public final synthetic b:F

.field public final synthetic c:F


# direct methods
.method public synthetic constructor <init>(FFJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p3, p0, La/djs;->a:J

    iput p1, p0, La/djs;->b:F

    iput p2, p0, La/djs;->c:F

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    check-cast p1, La/pi9;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v0, La/qmk;->a:La/zcl;

    .line 7
    .line 8
    const/high16 v0, 0x41000000    # 8.0f

    .line 9
    .line 10
    invoke-virtual {p1}, La/pi9;->getDensity()F

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    mul-float/2addr v1, v0

    .line 15
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    int-to-long v2, v0

    .line 20
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    int-to-long v0, v0

    .line 25
    const/16 v4, 0x20

    .line 26
    .line 27
    shl-long/2addr v2, v4

    .line 28
    const-wide v4, 0xffffffffL

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    and-long/2addr v0, v4

    .line 34
    or-long v9, v2, v0

    .line 35
    .line 36
    new-instance v4, La/ejs;

    .line 37
    .line 38
    iget-wide v5, p0, La/djs;->a:J

    .line 39
    .line 40
    iget v7, p0, La/djs;->b:F

    .line 41
    .line 42
    iget v8, p0, La/djs;->c:F

    .line 43
    .line 44
    invoke-direct/range {v4 .. v10}, La/ejs;-><init>(JFFJ)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1, v4}, La/pi9;->a(Lkotlin/jvm/functions/Function1;)La/psc;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    return-object p0
.end method
