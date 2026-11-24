.class public final synthetic La/wi70;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/aj70;


# direct methods
.method public synthetic constructor <init>(La/aj70;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/wi70;->a:B

    iput-object p1, p0, La/wi70;->b:La/aj70;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/wi70;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/wi70;->b:La/aj70;

    .line 4
    .line 5
    check-cast p1, Landroid/view/View;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v0, La/aj70;->P1:La/xi70;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, La/aj70;->H0()La/tj70;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    iget-object p1, p0, La/tj70;->g:La/spx;

    .line 20
    .line 21
    invoke-virtual {p1}, La/spx;->a()Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-nez p1, :cond_0

    .line 26
    .line 27
    sget-object p1, La/gle;->a:La/gle;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, La/tj70;->w(La/zy5;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 33
    .line 34
    return-object p0

    .line 35
    :pswitch_0
    sget-object v0, La/aj70;->P1:La/xi70;

    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, La/aj70;->H0()La/tj70;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    iget-object p1, p0, La/tj70;->b:La/hpb;

    .line 45
    .line 46
    iget-object p1, p1, La/hpb;->a:La/pbt;

    .line 47
    .line 48
    iget-object p1, p1, La/pbt;->a:La/j5t;

    .line 49
    .line 50
    iget-boolean v0, p1, La/j5t;->g:Z

    .line 51
    .line 52
    xor-int/lit8 v0, v0, 0x1

    .line 53
    .line 54
    iput-boolean v0, p1, La/j5t;->g:Z

    .line 55
    .line 56
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    const-string v0, "instantBetVisibility"

    .line 61
    .line 62
    invoke-static {p1, v0}, La/j5t;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0}, La/tj70;->E()V

    .line 66
    .line 67
    .line 68
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 69
    .line 70
    return-object p0

    .line 71
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
