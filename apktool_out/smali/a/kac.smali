.class public final synthetic La/kac;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/abi0;


# direct methods
.method public synthetic constructor <init>(La/abi0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/kac;->a:B

    iput-object p1, p0, La/kac;->b:La/abi0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/kac;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object p0, p0, La/kac;->b:La/abi0;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p1, La/ez2;

    .line 10
    .line 11
    iget-object v0, p1, La/ez2;->a:Landroid/view/autofill/AutofillValue;

    .line 12
    .line 13
    invoke-static {v0}, La/y6;->C(Landroid/view/autofill/AutofillValue;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget-object p1, p1, La/ez2;->a:Landroid/view/autofill/AutofillValue;

    .line 20
    .line 21
    invoke-static {p1}, La/y6;->D(Landroid/view/autofill/AutofillValue;)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 p1, 0x0

    .line 31
    :goto_0
    if-eqz p1, :cond_2

    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-eqz p1, :cond_1

    .line 38
    .line 39
    sget-object p1, La/evq0;->a:La/evq0;

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    sget-object p1, La/evq0;->b:La/evq0;

    .line 43
    .line 44
    :goto_1
    invoke-static {p0, p1}, La/yai0;->i(La/abi0;La/evq0;)V

    .line 45
    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_2
    const/4 v1, 0x0

    .line 49
    :goto_2
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0

    .line 54
    :pswitch_0
    check-cast p1, La/hps0;

    .line 55
    .line 56
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    check-cast p1, La/jp80;

    .line 60
    .line 61
    iput-boolean v1, p1, La/jp80;->p:Z

    .line 62
    .line 63
    iget-object v0, p1, La/jp80;->o:La/on;

    .line 64
    .line 65
    invoke-virtual {v0, p0}, La/on;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    invoke-static {p1}, La/s0x;->S(La/qai0;)V

    .line 69
    .line 70
    .line 71
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 72
    .line 73
    return-object p0

    .line 74
    nop

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
