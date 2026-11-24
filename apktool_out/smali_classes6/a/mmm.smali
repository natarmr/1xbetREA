.class public final synthetic La/mmm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/xk80;

.field public final synthetic c:La/omm;

.field public final synthetic d:F


# direct methods
.method public synthetic constructor <init>(La/xk80;La/omm;F)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput-byte v0, p0, La/mmm;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/mmm;->b:La/xk80;

    iput-object p2, p0, La/mmm;->c:La/omm;

    iput p3, p0, La/mmm;->d:F

    return-void
.end method

.method public synthetic constructor <init>(La/xk80;La/omm;FI)V
    .locals 0

    .line 2
    const/4 p4, 0x0

    iput-byte p4, p0, La/mmm;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/mmm;->b:La/xk80;

    iput-object p2, p0, La/mmm;->c:La/omm;

    iput p3, p0, La/mmm;->d:F

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, La/mmm;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget v2, p0, La/mmm;->d:F

    .line 5
    .line 6
    iget-object v3, p0, La/mmm;->c:La/omm;

    .line 7
    .line 8
    iget-object p0, p0, La/mmm;->b:La/xk80;

    .line 9
    .line 10
    check-cast p1, La/fet;

    .line 11
    .line 12
    check-cast p2, Ljava/lang/Integer;

    .line 13
    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    and-int/lit8 v0, p2, 0x3

    .line 22
    .line 23
    const/4 v4, 0x2

    .line 24
    const/4 v5, 0x0

    .line 25
    if-eq v0, v4, :cond_0

    .line 26
    .line 27
    move v0, v1

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move v0, v5

    .line 30
    :goto_0
    and-int/2addr p2, v1

    .line 31
    invoke-virtual {p1, p2, v0}, La/fet;->U(IZ)Z

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    if-eqz p2, :cond_1

    .line 36
    .line 37
    invoke-static {p0, v3, v2, p1, v5}, La/dub;->J(La/xk80;La/omm;FLa/fet;I)V

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    invoke-virtual {p1}, La/fet;->X()V

    .line 42
    .line 43
    .line 44
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 45
    .line 46
    return-object p0

    .line 47
    :pswitch_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    invoke-static {v1}, La/x8x;->L(I)I

    .line 51
    .line 52
    .line 53
    move-result p2

    .line 54
    invoke-static {p0, v3, v2, p1, p2}, La/dub;->J(La/xk80;La/omm;FLa/fet;I)V

    .line 55
    .line 56
    .line 57
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 58
    .line 59
    return-object p0

    .line 60
    nop

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
