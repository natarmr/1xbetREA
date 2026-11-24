.class public final synthetic La/vpm;
.super La/rer;
.source "SourceFile"

# interfaces
.implements La/ydr;


# virtual methods
.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/CharSequence;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Number;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    check-cast p3, Ljava/lang/Number;

    .line 10
    .line 11
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result p3

    .line 15
    check-cast p4, Ljava/lang/Number;

    .line 16
    .line 17
    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    .line 18
    .line 19
    .line 20
    move-result p4

    .line 21
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast p0, Landroid/text/TextWatcher;

    .line 24
    .line 25
    invoke-interface {p0, p1, p2, p3, p4}, Landroid/text/TextWatcher;->beforeTextChanged(Ljava/lang/CharSequence;III)V

    .line 26
    .line 27
    .line 28
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 29
    .line 30
    return-object p0
.end method
