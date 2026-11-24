.class public final synthetic La/a3b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/pru;

.field public final synthetic c:La/bzt;

.field public final synthetic d:La/iqt;


# direct methods
.method public synthetic constructor <init>(La/pru;La/bzt;La/iqt;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput-byte v0, p0, La/a3b0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/a3b0;->b:La/pru;

    iput-object p2, p0, La/a3b0;->c:La/bzt;

    iput-object p3, p0, La/a3b0;->d:La/iqt;

    return-void
.end method

.method public synthetic constructor <init>(La/pru;La/iqt;La/bzt;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/a3b0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/a3b0;->b:La/pru;

    iput-object p2, p0, La/a3b0;->d:La/iqt;

    iput-object p3, p0, La/a3b0;->c:La/bzt;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/a3b0;->a:B

    .line 4
    .line 5
    iget-object v2, v0, La/a3b0;->d:La/iqt;

    .line 6
    .line 7
    iget-object v3, v0, La/a3b0;->c:La/bzt;

    .line 8
    .line 9
    iget-object v0, v0, La/a3b0;->b:La/pru;

    .line 10
    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, La/pru;->a()La/sff0;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v1, v3, La/bzt;->a:La/fsd;

    .line 19
    .line 20
    invoke-virtual {v1}, La/fsd;->a()La/v8d;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    new-instance v3, La/ncv0;

    .line 25
    .line 26
    sget-object v4, La/iun;->a:La/iun;

    .line 27
    .line 28
    invoke-static {v0}, La/ufx;->P(La/sff0;)La/dxh0;

    .line 29
    .line 30
    .line 31
    move-result-object v7

    .line 32
    iget-object v2, v2, La/iqt;->a:La/gst0;

    .line 33
    .line 34
    invoke-virtual {v2}, La/gst0;->a()Z

    .line 35
    .line 36
    .line 37
    move-result v8

    .line 38
    iget-boolean v9, v0, La/sff0;->J1:Z

    .line 39
    .line 40
    iget v10, v1, La/v8d;->r:I

    .line 41
    .line 42
    const/4 v11, 0x0

    .line 43
    const/4 v5, 0x0

    .line 44
    const/4 v6, 0x0

    .line 45
    invoke-direct/range {v3 .. v11}, La/ncv0;-><init>(Ljava/util/List;La/i3m0;ZLa/dxh0;ZZIZ)V

    .line 46
    .line 47
    .line 48
    return-object v3

    .line 49
    :pswitch_0
    invoke-virtual {v0}, La/pru;->a()La/sff0;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    iget-object v0, v0, La/sff0;->b:La/hl1;

    .line 54
    .line 55
    iget-boolean v7, v0, La/hl1;->C:Z

    .line 56
    .line 57
    iget-object v1, v2, La/iqt;->a:La/gst0;

    .line 58
    .line 59
    invoke-virtual {v1}, La/gst0;->a()Z

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    iget-object v1, v3, La/bzt;->a:La/fsd;

    .line 64
    .line 65
    invoke-virtual {v1}, La/fsd;->a()La/v8d;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    iget v10, v1, La/v8d;->r:I

    .line 70
    .line 71
    iget-object v11, v0, La/hl1;->l:La/ot0;

    .line 72
    .line 73
    iget-boolean v12, v0, La/hl1;->d:Z

    .line 74
    .line 75
    iget-object v0, v0, La/hl1;->a:La/f61;

    .line 76
    .line 77
    iget-boolean v13, v0, La/f61;->k:Z

    .line 78
    .line 79
    sget-object v14, La/xun;->a:La/xun;

    .line 80
    .line 81
    invoke-static {v7}, La/g8x;->x(Z)La/lc00;

    .line 82
    .line 83
    .line 84
    move-result-object v16

    .line 85
    new-instance v4, La/u2b0;

    .line 86
    .line 87
    const/4 v9, 0x0

    .line 88
    const/4 v15, 0x0

    .line 89
    const/4 v6, 0x1

    .line 90
    const/4 v8, 0x0

    .line 91
    invoke-direct/range {v4 .. v16}, La/u2b0;-><init>(ZZZZZILa/ot0;ZZLjava/util/Set;La/hus;Ljava/util/List;)V

    .line 92
    .line 93
    .line 94
    return-object v4

    .line 95
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
