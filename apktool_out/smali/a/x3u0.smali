.class public final synthetic La/x3u0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/y3u0;


# direct methods
.method public synthetic constructor <init>(La/y3u0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/x3u0;->a:B

    iput-object p1, p0, La/x3u0;->b:La/y3u0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/x3u0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/x3u0;->b:La/y3u0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, La/fhl;

    .line 9
    .line 10
    iget-object v0, p0, La/y3u0;->b:La/wgv;

    .line 11
    .line 12
    iget v1, p0, La/y3u0;->k:F

    .line 13
    .line 14
    iget p0, p0, La/y3u0;->l:F

    .line 15
    .line 16
    invoke-interface {p1}, La/fhl;->A0()La/nr;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {v2}, La/nr;->p()J

    .line 21
    .line 22
    .line 23
    move-result-wide v3

    .line 24
    invoke-virtual {v2}, La/nr;->i()La/x5a;

    .line 25
    .line 26
    .line 27
    move-result-object v5

    .line 28
    invoke-interface {v5}, La/x5a;->l()V

    .line 29
    .line 30
    .line 31
    :try_start_0
    iget-object v5, v2, La/nr;->b:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v5, La/fvt0;

    .line 34
    .line 35
    const-wide/16 v6, 0x0

    .line 36
    .line 37
    invoke-virtual {v5, v1, p0, v6, v7}, La/fvt0;->z(FFJ)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, p1}, La/wgv;->a(La/fhl;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    .line 42
    .line 43
    invoke-static {v2, v3, v4}, Lc;->g(La/nr;J)V

    .line 44
    .line 45
    .line 46
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 47
    .line 48
    return-object p0

    .line 49
    :catchall_0
    move-exception p0

    .line 50
    invoke-static {v2, v3, v4}, Lc;->g(La/nr;J)V

    .line 51
    .line 52
    .line 53
    throw p0

    .line 54
    :pswitch_0
    check-cast p1, La/hwt0;

    .line 55
    .line 56
    const/4 p1, 0x1

    .line 57
    iput-boolean p1, p0, La/y3u0;->d:Z

    .line 58
    .line 59
    iget-object p0, p0, La/y3u0;->f:Lkotlin/jvm/functions/Function0;

    .line 60
    .line 61
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 65
    .line 66
    return-object p0

    .line 67
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
