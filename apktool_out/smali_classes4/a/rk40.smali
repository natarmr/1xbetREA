.class public final synthetic La/rk40;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/wk40;


# direct methods
.method public synthetic constructor <init>(La/wk40;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/rk40;->a:B

    iput-object p1, p0, La/rk40;->b:La/wk40;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, La/rk40;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/rk40;->b:La/wk40;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, La/wk40;->h:La/a7q;

    .line 9
    .line 10
    const-wide/16 v1, 0x28

    .line 11
    .line 12
    const-wide/16 v3, 0x24

    .line 13
    .line 14
    invoke-virtual {v0, v1, v2, v3, v4}, La/a7q;->a(JJ)La/vsg0;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    new-instance v1, La/ak9;

    .line 19
    .line 20
    const/4 v2, 0x7

    .line 21
    invoke-direct {v1, v0, v2}, La/ak9;-><init>(La/vsg0;B)V

    .line 22
    .line 23
    .line 24
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    new-instance v0, La/o6m0;

    .line 29
    .line 30
    const-wide v2, 0x7fffffffffffffffL

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    invoke-direct {v0, v2, v3}, La/o6m0;-><init>(J)V

    .line 36
    .line 37
    .line 38
    new-instance v2, La/cqr;

    .line 39
    .line 40
    const v3, 0x7f0606d8

    .line 41
    .line 42
    .line 43
    const/4 v4, 0x0

    .line 44
    const-string v5, ""

    .line 45
    .line 46
    invoke-direct {v2, v5, v3, v4}, La/cqr;-><init>(Ljava/lang/String;IZ)V

    .line 47
    .line 48
    .line 49
    invoke-static {v1, p0, v0, v2}, La/vtb;->h0(La/gmq;La/vne;La/lpj0;Ljava/lang/Object;)La/xae0;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0

    .line 54
    :pswitch_0
    iget-object p0, p0, La/wk40;->p:La/hqc;

    .line 55
    .line 56
    invoke-virtual {p0}, La/hqc;->a()La/gmq;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    return-object p0

    .line 61
    :pswitch_1
    iget-object p0, p0, La/wk40;->q:La/lbu;

    .line 62
    .line 63
    invoke-virtual {p0}, La/lbu;->j()Z

    .line 64
    .line 65
    .line 66
    move-result p0

    .line 67
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    return-object p0

    .line 72
    nop

    .line 73
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
