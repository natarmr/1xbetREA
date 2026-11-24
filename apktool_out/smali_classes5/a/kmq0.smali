.class public final synthetic La/kmq0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/nmq0;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(La/nmq0;IB)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/kmq0;->a:B

    iput-object p1, p0, La/kmq0;->b:La/nmq0;

    iput p2, p0, La/kmq0;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, La/kmq0;->a:B

    .line 2
    .line 3
    const-string v1, "CURRENT_SELECTED_LIMIT_BUNDLE_KEY"

    .line 4
    .line 5
    iget v2, p0, La/kmq0;->c:I

    .line 6
    .line 7
    iget-object p0, p0, La/kmq0;->b:La/nmq0;

    .line 8
    .line 9
    check-cast p1, Landroid/view/View;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    sget-object v0, La/nmq0;->Q1:[La/iiy;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, La/nmq0;->H0()La/wmq0;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iget-object v3, v0, La/wmq0;->g:La/p7m0;

    .line 24
    .line 25
    :cond_0
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    move-object p1, p0

    .line 30
    check-cast p1, La/g9i0;

    .line 31
    .line 32
    invoke-static {}, La/g9i0;->values()[La/g9i0;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    aget-object p1, p1, v2

    .line 37
    .line 38
    iget-object v4, v0, La/wmq0;->b:La/vzg0;

    .line 39
    .line 40
    invoke-virtual {v4, v1, p1}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v3, p0, p1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    if-eqz p0, :cond_0

    .line 48
    .line 49
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 50
    .line 51
    return-object p0

    .line 52
    :pswitch_0
    sget-object v0, La/nmq0;->Q1:[La/iiy;

    .line 53
    .line 54
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, La/nmq0;->H0()La/wmq0;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    iget-object p1, p0, La/wmq0;->g:La/p7m0;

    .line 62
    .line 63
    :cond_1
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    move-object v3, v0

    .line 68
    check-cast v3, La/g9i0;

    .line 69
    .line 70
    invoke-static {}, La/g9i0;->values()[La/g9i0;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    aget-object v3, v3, v2

    .line 75
    .line 76
    iget-object v4, p0, La/wmq0;->b:La/vzg0;

    .line 77
    .line 78
    invoke-virtual {v4, v1, v3}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-eqz v0, :cond_1

    .line 86
    .line 87
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 88
    .line 89
    return-object p0

    .line 90
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
