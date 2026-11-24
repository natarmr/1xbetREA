.class public final La/vuv0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/kmq;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ywv0;


# direct methods
.method public synthetic constructor <init>(La/ywv0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/vuv0;->a:B

    iput-object p1, p0, La/vuv0;->b:La/ywv0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/vuv0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/vuv0;->b:La/ywv0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Lkotlin/Unit;

    .line 9
    .line 10
    invoke-static {p0, p2}, La/wbl0;->l(La/ywv0;La/yje;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    sget-object p1, La/wne;->a:La/wne;

    .line 15
    .line 16
    if-ne p0, p1, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 20
    .line 21
    :goto_0
    return-object p0

    .line 22
    :pswitch_0
    check-cast p1, La/pb5;

    .line 23
    .line 24
    iget-object v0, p0, La/ywv0;->c:La/fht0;

    .line 25
    .line 26
    iget-object p0, p0, La/ywv0;->d:La/glt0;

    .line 27
    .line 28
    invoke-virtual {v0}, La/fht0;->f()La/cvv0;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    invoke-virtual {p0}, La/glt0;->d()La/lxv0;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-static {v0, v1}, La/ktt0;->g(La/cvv0;La/lxv0;)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    int-to-float v0, v0

    .line 43
    const/high16 v1, 0x3f800000    # 1.0f

    .line 44
    .line 45
    iget p1, p1, La/pb5;->c:F

    .line 46
    .line 47
    sub-float/2addr v1, p1

    .line 48
    mul-float/2addr v1, v0

    .line 49
    invoke-virtual {p0, v1, p2}, La/glt0;->g(FLa/yje;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    sget-object p1, La/wne;->a:La/wne;

    .line 54
    .line 55
    if-ne p0, p1, :cond_1

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 62
    .line 63
    :goto_1
    return-object p0

    .line 64
    nop

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
