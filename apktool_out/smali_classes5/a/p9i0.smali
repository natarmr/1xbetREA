.class public final synthetic La/p9i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/t9i0;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(La/t9i0;IB)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/p9i0;->a:B

    iput-object p1, p0, La/p9i0;->b:La/t9i0;

    iput p2, p0, La/p9i0;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/p9i0;->a:B

    .line 2
    .line 3
    iget v1, p0, La/p9i0;->c:I

    .line 4
    .line 5
    iget-object p0, p0, La/p9i0;->b:La/t9i0;

    .line 6
    .line 7
    check-cast p1, Landroid/view/View;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    sget-object v0, La/t9i0;->Q1:[La/iiy;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, La/t9i0;->H0()La/cai0;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-static {}, La/f9i0;->values()[La/f9i0;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    aget-object p1, p1, v1

    .line 26
    .line 27
    invoke-virtual {p0, p1}, La/cai0;->x(La/f9i0;)V

    .line 28
    .line 29
    .line 30
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 31
    .line 32
    return-object p0

    .line 33
    :pswitch_0
    sget-object v0, La/t9i0;->Q1:[La/iiy;

    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, La/t9i0;->H0()La/cai0;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-static {}, La/f9i0;->values()[La/f9i0;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    aget-object p1, p1, v1

    .line 47
    .line 48
    invoke-virtual {p0, p1}, La/cai0;->x(La/f9i0;)V

    .line 49
    .line 50
    .line 51
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 52
    .line 53
    return-object p0

    .line 54
    nop

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
