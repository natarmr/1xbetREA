.class public final synthetic La/s82;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/f3d;


# direct methods
.method public synthetic constructor <init>(La/f3d;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/s82;->a:B

    iput-object p1, p0, La/s82;->b:La/f3d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/s82;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x0

    .line 6
    iget-object p0, p0, La/s82;->b:La/f3d;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, La/f3d;->a:La/agk0;

    .line 12
    .line 13
    invoke-virtual {p0}, La/agk0;->l()F

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    cmpg-float p0, p0, v2

    .line 18
    .line 19
    if-nez p0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move v1, v3

    .line 23
    :goto_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0

    .line 28
    :pswitch_0
    new-instance v0, La/e3d;

    .line 29
    .line 30
    invoke-direct {v0, p0}, La/e3d;-><init>(La/f3d;)V

    .line 31
    .line 32
    .line 33
    return-object v0

    .line 34
    :pswitch_1
    new-instance v0, La/c3d;

    .line 35
    .line 36
    invoke-direct {v0, p0, v3}, La/c3d;-><init>(Ljava/lang/Object;B)V

    .line 37
    .line 38
    .line 39
    return-object v0

    .line 40
    :pswitch_2
    iget-object v0, p0, La/f3d;->a:La/agk0;

    .line 41
    .line 42
    invoke-virtual {v0}, La/agk0;->l()F

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-object p0, p0, La/f3d;->d:La/agk0;

    .line 47
    .line 48
    invoke-virtual {p0}, La/agk0;->l()F

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    div-float/2addr v0, p0

    .line 53
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    return-object p0

    .line 58
    :pswitch_3
    invoke-virtual {p0}, La/f3d;->d()F

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    return-object p0

    .line 67
    :pswitch_4
    invoke-virtual {p0}, La/f3d;->d()F

    .line 68
    .line 69
    .line 70
    move-result p0

    .line 71
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    return-object p0

    .line 76
    :pswitch_5
    invoke-virtual {p0}, La/f3d;->d()F

    .line 77
    .line 78
    .line 79
    move-result p0

    .line 80
    const/high16 v0, 0x3f000000    # 0.5f

    .line 81
    .line 82
    cmpl-float p0, p0, v0

    .line 83
    .line 84
    if-lez p0, :cond_1

    .line 85
    .line 86
    sget-object p0, La/vxl;->a:La/vxl;

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_1
    sget-object p0, La/vxl;->c:La/vxl;

    .line 90
    .line 91
    :goto_1
    return-object p0

    .line 92
    :pswitch_6
    iget-object p0, p0, La/f3d;->a:La/agk0;

    .line 93
    .line 94
    invoke-virtual {p0}, La/agk0;->l()F

    .line 95
    .line 96
    .line 97
    move-result p0

    .line 98
    cmpg-float p0, p0, v2

    .line 99
    .line 100
    if-nez p0, :cond_2

    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_2
    move v1, v3

    .line 104
    :goto_2
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    return-object p0

    .line 109
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
