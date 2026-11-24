.class public final synthetic La/xtl0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/xdr;

.field public final synthetic c:La/xdr;

.field public final synthetic d:La/pz40;

.field public final synthetic e:F

.field public final synthetic f:Z

.field public final synthetic g:J


# direct methods
.method public synthetic constructor <init>(La/xdr;La/xdr;La/pz40;FZJB)V
    .locals 0

    .line 1
    iput-byte p8, p0, La/xtl0;->a:B

    iput-object p1, p0, La/xtl0;->b:La/xdr;

    iput-object p2, p0, La/xtl0;->c:La/xdr;

    iput-object p3, p0, La/xtl0;->d:La/pz40;

    iput p4, p0, La/xtl0;->e:F

    iput-boolean p5, p0, La/xtl0;->f:Z

    iput-wide p6, p0, La/xtl0;->g:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/xtl0;->a:B

    .line 2
    .line 3
    const-string v1, "TOTAL_CONTENT_ID"

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x0

    .line 7
    iget-wide v4, p0, La/xtl0;->g:J

    .line 8
    .line 9
    iget-boolean v6, p0, La/xtl0;->f:Z

    .line 10
    .line 11
    iget v7, p0, La/xtl0;->e:F

    .line 12
    .line 13
    iget-object v8, p0, La/xtl0;->d:La/pz40;

    .line 14
    .line 15
    iget-object v9, p0, La/xtl0;->c:La/xdr;

    .line 16
    .line 17
    iget-object p0, p0, La/xtl0;->b:La/xdr;

    .line 18
    .line 19
    sget-object v10, La/jm40;->b:La/jm40;

    .line 20
    .line 21
    packed-switch v0, :pswitch_data_0

    .line 22
    .line 23
    .line 24
    if-nez p0, :cond_0

    .line 25
    .line 26
    if-nez v9, :cond_0

    .line 27
    .line 28
    invoke-interface {v8}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    if-eqz p0, :cond_1

    .line 33
    .line 34
    :cond_0
    new-instance p0, La/gbc;

    .line 35
    .line 36
    const/4 v0, 0x6

    .line 37
    invoke-direct {p0, v6, v4, v5, v0}, La/gbc;-><init>(ZJB)V

    .line 38
    .line 39
    .line 40
    invoke-static {v10, p0}, La/rq8;->L(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    sget-object v0, La/qmk;->a:La/zcl;

    .line 45
    .line 46
    const/high16 v0, 0x41000000    # 8.0f

    .line 47
    .line 48
    invoke-static {p0, v0, v3, v2}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 49
    .line 50
    .line 51
    move-result-object v10

    .line 52
    :cond_1
    invoke-static {v10, v7}, La/o7k0;->s(La/mm40;F)La/mm40;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-static {p0, v1}, La/mrv;->k0(La/mm40;Ljava/lang/Object;)La/mm40;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    return-object p0

    .line 61
    :pswitch_0
    if-nez p0, :cond_2

    .line 62
    .line 63
    if-nez v9, :cond_2

    .line 64
    .line 65
    invoke-interface {v8}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    if-eqz p0, :cond_3

    .line 70
    .line 71
    :cond_2
    new-instance p0, La/gbc;

    .line 72
    .line 73
    const/4 v0, 0x5

    .line 74
    invoke-direct {p0, v6, v4, v5, v0}, La/gbc;-><init>(ZJB)V

    .line 75
    .line 76
    .line 77
    invoke-static {v10, p0}, La/rq8;->L(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    sget-object v0, La/qmk;->a:La/zcl;

    .line 82
    .line 83
    const/high16 v0, 0x40800000    # 4.0f

    .line 84
    .line 85
    invoke-static {p0, v0, v3, v2}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 86
    .line 87
    .line 88
    move-result-object v10

    .line 89
    :cond_3
    invoke-static {v10, v7}, La/o7k0;->s(La/mm40;F)La/mm40;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    invoke-static {p0, v1}, La/mrv;->k0(La/mm40;Ljava/lang/Object;)La/mm40;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    return-object p0

    .line 98
    nop

    .line 99
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
