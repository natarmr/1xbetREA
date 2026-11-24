.class public final La/toj0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/pz40;

.field public final b:La/pz40;

.field public final c:La/sd60;

.field public final d:J

.field public e:J

.field public f:F

.field public g:F

.field public h:J

.field public i:J

.field public j:La/i6u0;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 5
    .line 6
    invoke-static {v0}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    iput-object v1, p0, La/toj0;->a:La/pz40;

    .line 11
    .line 12
    invoke-static {v0}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iput-object v0, p0, La/toj0;->b:La/pz40;

    .line 17
    .line 18
    new-instance v0, La/sd60;

    .line 19
    .line 20
    const/16 v1, 0x9

    .line 21
    .line 22
    invoke-direct {v0, v1}, La/sd60;-><init>(B)V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, La/toj0;->c:La/sd60;

    .line 26
    .line 27
    sget-object v0, La/qlq0;->a:La/qlq0;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    sget-object v0, La/rq40;->a:La/rq40;

    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    invoke-static {}, La/rq40;->b()J

    .line 38
    .line 39
    .line 40
    move-result-wide v0

    .line 41
    iput-wide v0, p0, La/toj0;->d:J

    .line 42
    .line 43
    sget-wide v0, La/y3d;->f:J

    .line 44
    .line 45
    iput-wide v0, p0, La/toj0;->e:J

    .line 46
    .line 47
    const/high16 v0, 0x3f800000    # 1.0f

    .line 48
    .line 49
    iput v0, p0, La/toj0;->f:F

    .line 50
    .line 51
    iput v0, p0, La/toj0;->g:F

    .line 52
    .line 53
    sget-wide v0, La/ils0;->b:J

    .line 54
    .line 55
    iput-wide v0, p0, La/toj0;->h:J

    .line 56
    .line 57
    const-wide/16 v0, 0x0

    .line 58
    .line 59
    iput-wide v0, p0, La/toj0;->i:J

    .line 60
    .line 61
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 0

    .line 1
    iget-object p0, p0, La/toj0;->b:La/pz40;

    .line 2
    .line 3
    check-cast p0, La/hgk0;

    .line 4
    .line 5
    invoke-virtual {p0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Ljava/lang/Boolean;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0
.end method

.method public final b()Z
    .locals 0

    .line 1
    iget-object p0, p0, La/toj0;->a:La/pz40;

    .line 2
    .line 3
    check-cast p0, La/hgk0;

    .line 4
    .line 5
    invoke-virtual {p0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Ljava/lang/Boolean;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0
.end method

.method public final c(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, La/toj0;->a:La/pz40;

    .line 2
    .line 3
    check-cast v0, La/hgk0;

    .line 4
    .line 5
    invoke-virtual {v0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Ljava/lang/Boolean;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    iget-object p0, p0, La/toj0;->b:La/pz40;

    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    if-nez p1, :cond_0

    .line 20
    .line 21
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 22
    .line 23
    check-cast p0, La/hgk0;

    .line 24
    .line 25
    invoke-virtual {p0, v1}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    if-eqz p1, :cond_1

    .line 30
    .line 31
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 32
    .line 33
    check-cast p0, La/hgk0;

    .line 34
    .line 35
    invoke-virtual {p0, v1}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    :cond_1
    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-virtual {v0, p0}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    return-void
.end method
