.class public final La/ppm0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/j39;


# instance fields
.field public final b:Lkotlin/jvm/functions/Function0;

.field public final c:Z

.field public final d:La/k6z;

.field public final e:Z

.field public final f:La/j39;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function0;ZLa/k6z;ZLa/j39;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/ppm0;->b:Lkotlin/jvm/functions/Function0;

    .line 5
    .line 6
    iput-boolean p2, p0, La/ppm0;->c:Z

    .line 7
    .line 8
    iput-object p3, p0, La/ppm0;->d:La/k6z;

    .line 9
    .line 10
    iput-boolean p4, p0, La/ppm0;->e:Z

    .line 11
    .line 12
    iput-object p5, p0, La/ppm0;->f:La/j39;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final a(FFF)F
    .locals 5

    .line 1
    iget-object v0, p0, La/ppm0;->b:Lkotlin/jvm/functions/Function0;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Number;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    int-to-float v0, v0

    .line 14
    iget-object v1, p0, La/ppm0;->d:La/k6z;

    .line 15
    .line 16
    sget-object v2, La/k6z;->b:La/k6z;

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    const/4 v4, 0x1

    .line 20
    if-ne v1, v2, :cond_0

    .line 21
    .line 22
    move v1, v4

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move v1, v3

    .line 25
    :goto_0
    iget-boolean v2, p0, La/ppm0;->e:Z

    .line 26
    .line 27
    if-nez v2, :cond_1

    .line 28
    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    move v3, v4

    .line 32
    :cond_1
    iget-boolean v1, p0, La/ppm0;->c:Z

    .line 33
    .line 34
    if-ne v1, v3, :cond_2

    .line 35
    .line 36
    sub-float/2addr p1, v0

    .line 37
    :cond_2
    iget-object p0, p0, La/ppm0;->f:La/j39;

    .line 38
    .line 39
    sub-float/2addr p3, v0

    .line 40
    invoke-interface {p0, p1, p2, p3}, La/j39;->a(FFF)F

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    return p0
.end method
