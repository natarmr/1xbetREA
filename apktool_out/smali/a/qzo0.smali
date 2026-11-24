.class public final synthetic La/qzo0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/xcz;

.field public final synthetic c:La/e2d;


# direct methods
.method public synthetic constructor <init>(La/xcz;La/e2d;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/qzo0;->a:B

    iput-object p1, p0, La/qzo0;->b:La/xcz;

    iput-object p2, p0, La/qzo0;->c:La/e2d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, La/qzo0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x0

    .line 6
    iget-object v4, p0, La/qzo0;->c:La/e2d;

    .line 7
    .line 8
    iget-object p0, p0, La/qzo0;->b:La/xcz;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, La/xcz;->h()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0}, La/xcz;->c()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    invoke-virtual {p0}, La/xcz;->d()Z

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    if-eqz p0, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    iget-object p0, v4, La/e2d;->a:La/oyq0;

    .line 33
    .line 34
    iget-object p0, p0, La/oyq0;->c:La/agk0;

    .line 35
    .line 36
    invoke-virtual {p0}, La/agk0;->l()F

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    cmpg-float p0, p0, v3

    .line 41
    .line 42
    if-nez p0, :cond_1

    .line 43
    .line 44
    move v1, v2

    .line 45
    :cond_1
    :goto_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    return-object p0

    .line 50
    :pswitch_0
    invoke-virtual {p0}, La/xcz;->h()I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-nez v0, :cond_2

    .line 55
    .line 56
    invoke-virtual {p0}, La/xcz;->c()Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-nez v0, :cond_3

    .line 61
    .line 62
    invoke-virtual {p0}, La/xcz;->d()Z

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    if-eqz p0, :cond_2

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_2
    iget-object p0, v4, La/e2d;->a:La/oyq0;

    .line 70
    .line 71
    iget-object p0, p0, La/oyq0;->c:La/agk0;

    .line 72
    .line 73
    invoke-virtual {p0}, La/agk0;->l()F

    .line 74
    .line 75
    .line 76
    move-result p0

    .line 77
    cmpg-float p0, p0, v3

    .line 78
    .line 79
    if-nez p0, :cond_3

    .line 80
    .line 81
    move v1, v2

    .line 82
    :cond_3
    :goto_1
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    return-object p0

    .line 87
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
