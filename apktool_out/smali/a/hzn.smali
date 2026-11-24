.class public final La/hzn;
.super La/guy;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/toj0;


# direct methods
.method public synthetic constructor <init>(La/toj0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/hzn;->a:B

    iput-object p1, p0, La/hzn;->b:La/toj0;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, La/guy;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/hzn;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/hzn;->b:La/toj0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, La/toj0;->b:La/pz40;

    .line 9
    .line 10
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 11
    .line 12
    check-cast v0, La/hgk0;

    .line 13
    .line 14
    invoke-virtual {v0, v1}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-virtual {p0, v0}, La/toj0;->c(Z)V

    .line 19
    .line 20
    .line 21
    iget-object v2, p0, La/toj0;->c:La/sd60;

    .line 22
    .line 23
    iget-object v3, v2, La/sd60;->b:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v3, La/pz40;

    .line 26
    .line 27
    check-cast v3, La/hgk0;

    .line 28
    .line 29
    invoke-virtual {v3, v1}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iget-object v3, v2, La/sd60;->d:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v3, La/pz40;

    .line 35
    .line 36
    check-cast v3, La/hgk0;

    .line 37
    .line 38
    invoke-virtual {v3, v1}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    iget-object v3, v2, La/sd60;->f:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v3, La/pz40;

    .line 44
    .line 45
    check-cast v3, La/hgk0;

    .line 46
    .line 47
    invoke-virtual {v3, v1}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object v2, v2, La/sd60;->h:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v2, La/pz40;

    .line 53
    .line 54
    check-cast v2, La/hgk0;

    .line 55
    .line 56
    invoke-virtual {v2, v1}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    sget-wide v1, La/y3d;->f:J

    .line 60
    .line 61
    iput-wide v1, p0, La/toj0;->e:J

    .line 62
    .line 63
    const/high16 v1, 0x3f800000    # 1.0f

    .line 64
    .line 65
    iput v1, p0, La/toj0;->f:F

    .line 66
    .line 67
    iput v1, p0, La/toj0;->g:F

    .line 68
    .line 69
    iget-object v1, p0, La/toj0;->j:La/i6u0;

    .line 70
    .line 71
    if-eqz v1, :cond_0

    .line 72
    .line 73
    iget-object v2, v1, La/i6u0;->d:[La/zaj;

    .line 74
    .line 75
    const/4 v3, 0x0

    .line 76
    invoke-static {v3, v2}, La/qx3;->m(Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    iput v0, v1, La/i6u0;->e:I

    .line 80
    .line 81
    :cond_0
    sget-wide v0, La/ils0;->b:J

    .line 82
    .line 83
    iput-wide v0, p0, La/toj0;->h:J

    .line 84
    .line 85
    const-wide/16 v0, 0x0

    .line 86
    .line 87
    iput-wide v0, p0, La/toj0;->i:J

    .line 88
    .line 89
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 90
    .line 91
    :pswitch_0
    return-object p0

    .line 92
    nop

    .line 93
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
