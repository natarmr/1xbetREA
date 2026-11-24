.class public final synthetic La/t3k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/v3k;


# direct methods
.method public synthetic constructor <init>(La/v3k;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/t3k;->a:B

    iput-object p1, p0, La/t3k;->b:La/v3k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/t3k;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/t3k;->b:La/v3k;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, La/lcg0;->a:La/zfn;

    .line 9
    .line 10
    invoke-static {p0, v0}, La/mbc;->R(La/vld;Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/icg0;

    .line 15
    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    iget-object p0, p0, La/icg0;->b:La/hcg0;

    .line 19
    .line 20
    if-nez p0, :cond_1

    .line 21
    .line 22
    :cond_0
    sget-object p0, La/i120;->k:La/hcg0;

    .line 23
    .line 24
    :cond_1
    return-object p0

    .line 25
    :pswitch_0
    sget-object v0, La/lcg0;->a:La/zfn;

    .line 26
    .line 27
    invoke-static {p0, v0}, La/mbc;->R(La/vld;Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, La/icg0;

    .line 32
    .line 33
    iget-object v1, p0, La/v3k;->u:La/p13;

    .line 34
    .line 35
    if-nez v0, :cond_3

    .line 36
    .line 37
    if-eqz v1, :cond_2

    .line 38
    .line 39
    invoke-virtual {p0, v1}, La/f3k;->a1(La/yzj;)V

    .line 40
    .line 41
    .line 42
    :cond_2
    const/4 v0, 0x0

    .line 43
    iput-object v0, p0, La/v3k;->u:La/p13;

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_3
    if-nez v1, :cond_4

    .line 47
    .line 48
    new-instance v5, La/u3k;

    .line 49
    .line 50
    const/4 v0, 0x0

    .line 51
    invoke-direct {v5, p0, v0}, La/u3k;-><init>(Ljava/lang/Object;B)V

    .line 52
    .line 53
    .line 54
    new-instance v6, La/t3k;

    .line 55
    .line 56
    const/4 v0, 0x1

    .line 57
    invoke-direct {v6, p0, v0}, La/t3k;-><init>(La/v3k;B)V

    .line 58
    .line 59
    .line 60
    iget-object v2, p0, La/v3k;->q:La/gy40;

    .line 61
    .line 62
    iget-boolean v3, p0, La/v3k;->r:Z

    .line 63
    .line 64
    iget v4, p0, La/v3k;->s:F

    .line 65
    .line 66
    sget-object v0, La/mcg0;->a:La/uts0;

    .line 67
    .line 68
    new-instance v1, La/p13;

    .line 69
    .line 70
    invoke-direct/range {v1 .. v6}, La/p13;-><init>(La/gy40;ZFLa/u3k;La/t3k;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0, v1}, La/f3k;->Z0(La/yzj;)La/yzj;

    .line 74
    .line 75
    .line 76
    iput-object v1, p0, La/v3k;->u:La/p13;

    .line 77
    .line 78
    :cond_4
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 79
    .line 80
    return-object p0

    .line 81
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
