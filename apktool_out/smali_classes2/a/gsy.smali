.class public final La/gsy;
.super Ljava/lang/Object;

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final b:La/hsy;


# direct methods
.method public synthetic constructor <init>(La/hsy;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/gsy;->a:B

    iput-object p1, p0, La/gsy;->b:La/hsy;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, La/gsy;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, La/gsy;->b:La/hsy;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-static {p0, v0}, La/x9x;->H(La/esy;Z)La/bv9;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :pswitch_0
    iget-object v1, p0, La/gsy;->b:La/hsy;

    .line 15
    .line 16
    invoke-virtual {v1}, La/esy;->u()La/osy;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    iget-object p0, p0, La/osy;->f:La/dqy;

    .line 21
    .line 22
    iget-object v2, p0, La/dqy;->i:La/jqy;

    .line 23
    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    new-instance v0, La/csy;

    .line 27
    .line 28
    invoke-virtual {v1}, La/esy;->u()La/osy;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-virtual {p0}, La/osy;->a()Ljava/util/List;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    sget-object v4, La/aiy;->d:La/aiy;

    .line 41
    .line 42
    invoke-virtual {v1}, La/esy;->u()La/osy;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    iget-object p0, p0, La/osy;->k:La/a8z;

    .line 47
    .line 48
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    move-object v5, p0

    .line 53
    check-cast v5, La/nzs0;

    .line 54
    .line 55
    invoke-direct/range {v0 .. v5}, La/csy;-><init>(La/pry;La/jqy;ILa/aiy;La/nzs0;)V

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    new-instance v0, La/zwj;

    .line 60
    .line 61
    invoke-virtual {v1}, La/esy;->u()La/osy;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    invoke-direct {v0, p0}, La/zwj;-><init>(La/ire0;)V

    .line 66
    .line 67
    .line 68
    :goto_0
    return-object v0

    .line 69
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
