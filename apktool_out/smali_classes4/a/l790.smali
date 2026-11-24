.class public final synthetic La/l790;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/r790;


# direct methods
.method public synthetic constructor <init>(La/r790;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/l790;->a:B

    iput-object p1, p0, La/l790;->b:La/r790;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/l790;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/l790;->b:La/r790;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Ljava/lang/String;

    .line 9
    .line 10
    sget-object v0, La/r790;->Z1:La/xi70;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, La/r790;->I0()La/k3t0;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    new-instance v0, La/m490;

    .line 20
    .line 21
    invoke-direct {v0, p1}, La/m490;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    return-object p0

    .line 30
    :pswitch_0
    check-cast p1, La/jb90;

    .line 31
    .line 32
    sget-object v0, La/r790;->Z1:La/xi70;

    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, La/r790;->G0()La/mni;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    new-instance v0, La/ojj;

    .line 42
    .line 43
    iget-object p0, p0, La/mni;->w:La/ony;

    .line 44
    .line 45
    const/4 v1, 0x1

    .line 46
    invoke-direct {v0, p0, v1}, La/ojj;-><init>(La/ony;B)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, p1}, La/ojj;->b(La/jb90;)V

    .line 50
    .line 51
    .line 52
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 53
    .line 54
    return-object p0

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
