.class public final synthetic La/wd60;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/l7m0;

.field public final synthetic c:La/ywv0;


# direct methods
.method public synthetic constructor <init>(La/l7m0;La/ywv0;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput-byte v0, p0, La/wd60;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/wd60;->b:La/l7m0;

    iput-object p2, p0, La/wd60;->c:La/ywv0;

    return-void
.end method

.method public synthetic constructor <init>(La/ywv0;La/l7m0;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput-byte v0, p0, La/wd60;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/wd60;->c:La/ywv0;

    iput-object p2, p0, La/wd60;->b:La/l7m0;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/wd60;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/wd60;->c:La/ywv0;

    .line 4
    .line 5
    iget-object p0, p0, La/wd60;->b:La/l7m0;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, Ljava/lang/Boolean;

    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    if-eqz p0, :cond_0

    .line 21
    .line 22
    iget-object p0, v1, La/ywv0;->m:La/vkr0;

    .line 23
    .line 24
    iget-object v0, p0, La/vkr0;->b:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v0, La/h0q0;

    .line 27
    .line 28
    invoke-virtual {v0}, La/h0q0;->p()La/bxv0;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iget-boolean v0, v0, La/bxv0;->e:Z

    .line 33
    .line 34
    if-eqz v0, :cond_0

    .line 35
    .line 36
    iget-object p0, p0, La/vkr0;->d:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast p0, La/trm0;

    .line 39
    .line 40
    iget-object v0, p0, La/trm0;->b:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v0, La/pz40;

    .line 43
    .line 44
    check-cast v0, La/hgk0;

    .line 45
    .line 46
    invoke-virtual {v0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    check-cast v0, Ljava/lang/Number;

    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    int-to-float v0, v0

    .line 57
    iget-object p0, p0, La/trm0;->c:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast p0, La/pz40;

    .line 60
    .line 61
    check-cast p0, La/hgk0;

    .line 62
    .line 63
    invoke-virtual {p0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    check-cast p0, Ljava/lang/Number;

    .line 68
    .line 69
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 70
    .line 71
    .line 72
    move-result p0

    .line 73
    int-to-float p0, p0

    .line 74
    const/high16 v1, 0x3fc00000    # 1.5f

    .line 75
    .line 76
    mul-float/2addr p0, v1

    .line 77
    cmpl-float p0, v0, p0

    .line 78
    .line 79
    if-lez p0, :cond_0

    .line 80
    .line 81
    const/4 p0, 0x1

    .line 82
    goto :goto_0

    .line 83
    :cond_0
    const/4 p0, 0x0

    .line 84
    :goto_0
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    return-object p0

    .line 89
    :pswitch_0
    iget-object v0, v1, La/ywv0;->d:La/glt0;

    .line 90
    .line 91
    invoke-virtual {v0}, La/glt0;->f()Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    new-instance v1, Lkotlin/Pair;

    .line 104
    .line 105
    invoke-direct {v1, v0, p0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    return-object v1

    .line 109
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
