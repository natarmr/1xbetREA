.class public final synthetic La/swv0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Z

.field public final synthetic c:La/ywv0;

.field public final synthetic d:F

.field public final synthetic e:J


# direct methods
.method public synthetic constructor <init>(ZZLa/ywv0;FJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, La/swv0;->a:Z

    iput-boolean p2, p0, La/swv0;->b:Z

    iput-object p3, p0, La/swv0;->c:La/ywv0;

    iput p4, p0, La/swv0;->d:F

    iput-wide p5, p0, La/swv0;->e:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    move-object v0, p1

    .line 2
    check-cast v0, La/fhl;

    .line 3
    .line 4
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-boolean p1, p0, La/swv0;->a:Z

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    iget-boolean p1, p0, La/swv0;->b:Z

    .line 12
    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    iget-object p1, p0, La/swv0;->c:La/ywv0;

    .line 16
    .line 17
    iget-object p1, p1, La/ywv0;->d:La/glt0;

    .line 18
    .line 19
    iget-object p1, p1, La/glt0;->c:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p1, La/t33;

    .line 22
    .line 23
    invoke-virtual {p1}, La/t33;->d()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Ljava/lang/Number;

    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    iget v1, p0, La/swv0;->d:F

    .line 34
    .line 35
    div-float/2addr p1, v1

    .line 36
    const/high16 v1, 0x3f800000    # 1.0f

    .line 37
    .line 38
    const/4 v2, 0x0

    .line 39
    invoke-static {p1, v2, v1}, La/l1e0;->c(FFF)F

    .line 40
    .line 41
    .line 42
    move-result v7

    .line 43
    cmpl-float p1, v7, v2

    .line 44
    .line 45
    if-lez p1, :cond_0

    .line 46
    .line 47
    const/4 v10, 0x0

    .line 48
    const/16 v11, 0x76

    .line 49
    .line 50
    iget-wide v1, p0, La/swv0;->e:J

    .line 51
    .line 52
    const-wide/16 v3, 0x0

    .line 53
    .line 54
    const-wide/16 v5, 0x0

    .line 55
    .line 56
    const/4 v8, 0x0

    .line 57
    const/4 v9, 0x0

    .line 58
    invoke-static/range {v0 .. v11}, La/fhl;->u(La/fhl;JJJFLa/vtm0;La/a4d;II)V

    .line 59
    .line 60
    .line 61
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 62
    .line 63
    return-object p0
.end method
