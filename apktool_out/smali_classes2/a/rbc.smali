.class public final La/rbc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/text/TextWatcher;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Landroid/view/ViewGroup;


# direct methods
.method public synthetic constructor <init>(Landroid/view/ViewGroup;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/rbc;->a:B

    iput-object p1, p0, La/rbc;->b:Landroid/view/ViewGroup;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/CharSequence;III)V
    .locals 0

    .line 1
    return-void
.end method

.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 2

    .line 1
    iget-byte v0, p0, La/rbc;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/rbc;->b:Landroid/view/ViewGroup;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, La/cxn;

    .line 9
    .line 10
    invoke-virtual {p0}, La/cxn;->a()La/dxn;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {p0}, La/dxn;->a()V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    check-cast p0, Lcom/google/android/material/timepicker/ChipTextInputComboView;

    .line 23
    .line 24
    const-string v1, "00"

    .line 25
    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    sget p1, Lcom/google/android/material/timepicker/ChipTextInputComboView;->e:I

    .line 29
    .line 30
    invoke-virtual {p0, v1}, Lcom/google/android/material/timepicker/ChipTextInputComboView;->a(Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    iput-object p1, p0, Lcom/google/android/material/timepicker/ChipTextInputComboView;->d:Ljava/lang/String;

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    sget v0, Lcom/google/android/material/timepicker/ChipTextInputComboView;->e:I

    .line 38
    .line 39
    invoke-virtual {p0, p1}, Lcom/google/android/material/timepicker/ChipTextInputComboView;->a(Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_1

    .line 48
    .line 49
    invoke-virtual {p0, v1}, Lcom/google/android/material/timepicker/ChipTextInputComboView;->a(Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    :cond_1
    iput-object p1, p0, Lcom/google/android/material/timepicker/ChipTextInputComboView;->d:Ljava/lang/String;

    .line 54
    .line 55
    :goto_0
    return-void

    .line 56
    nop

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .line 1
    iget-byte p1, p0, La/rbc;->a:B

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :pswitch_0
    iget-object p0, p0, La/rbc;->b:Landroid/view/ViewGroup;

    .line 8
    .line 9
    check-cast p0, La/cxn;

    .line 10
    .line 11
    invoke-virtual {p0}, La/cxn;->a()La/dxn;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p0}, La/dxn;->b()V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .line 1
    return-void
.end method
