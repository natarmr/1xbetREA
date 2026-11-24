.class public final La/fzn;
.super La/guy;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/pzn;

.field public final synthetic c:La/alo;

.field public final synthetic d:La/toj0;


# direct methods
.method public synthetic constructor <init>(La/pzn;La/alo;La/toj0;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/fzn;->a:B

    iput-object p1, p0, La/fzn;->b:La/pzn;

    iput-object p2, p0, La/fzn;->c:La/alo;

    iput-object p3, p0, La/fzn;->d:La/toj0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, La/guy;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/fzn;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/fzn;->b:La/pzn;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v3, p0, La/fzn;->d:La/toj0;

    .line 7
    .line 8
    iget-object p0, p0, La/fzn;->c:La/alo;

    .line 9
    .line 10
    const/4 v4, 0x2

    .line 11
    const/4 v5, 0x1

    .line 12
    const/high16 v6, 0x3f800000    # 1.0f

    .line 13
    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    check-cast p1, La/azn;

    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-eqz p1, :cond_2

    .line 24
    .line 25
    if-eq p1, v5, :cond_3

    .line 26
    .line 27
    if-ne p1, v4, :cond_1

    .line 28
    .line 29
    iget-object p0, p0, La/alo;->a:La/jms0;

    .line 30
    .line 31
    iget-object p0, p0, La/jms0;->d:La/k1h0;

    .line 32
    .line 33
    if-eqz p0, :cond_0

    .line 34
    .line 35
    iget v6, p0, La/k1h0;->a:F

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    iget v6, v3, La/toj0;->g:F

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    invoke-static {}, La/t9f;->b()V

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_2
    iget-object p0, v1, La/pzn;->a:La/jms0;

    .line 46
    .line 47
    iget-object p0, p0, La/jms0;->d:La/k1h0;

    .line 48
    .line 49
    if-eqz p0, :cond_3

    .line 50
    .line 51
    iget v6, p0, La/k1h0;->a:F

    .line 52
    .line 53
    :cond_3
    :goto_0
    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    :goto_1
    return-object v2

    .line 58
    :pswitch_0
    check-cast p1, La/azn;

    .line 59
    .line 60
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    if-eqz p1, :cond_6

    .line 65
    .line 66
    if-eq p1, v5, :cond_7

    .line 67
    .line 68
    if-ne p1, v4, :cond_5

    .line 69
    .line 70
    iget-object p0, p0, La/alo;->a:La/jms0;

    .line 71
    .line 72
    iget-object p0, p0, La/jms0;->a:La/fwo;

    .line 73
    .line 74
    if-eqz p0, :cond_4

    .line 75
    .line 76
    iget v6, p0, La/fwo;->a:F

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_4
    iget v6, v3, La/toj0;->f:F

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_5
    invoke-static {}, La/t9f;->b()V

    .line 83
    .line 84
    .line 85
    goto :goto_3

    .line 86
    :cond_6
    iget-object p0, v1, La/pzn;->a:La/jms0;

    .line 87
    .line 88
    iget-object p0, p0, La/jms0;->a:La/fwo;

    .line 89
    .line 90
    if-eqz p0, :cond_7

    .line 91
    .line 92
    iget v6, p0, La/fwo;->a:F

    .line 93
    .line 94
    :cond_7
    :goto_2
    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    :goto_3
    return-object v2

    .line 99
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
