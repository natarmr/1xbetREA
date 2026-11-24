.class public final La/ux00;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a()La/tx00;
    .locals 13

    .line 1
    sget-object v0, La/tx00;->l2:La/evz;

    .line 2
    .line 3
    new-instance v1, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 4
    .line 5
    sget-object v10, La/n12;->a:La/n12;

    .line 6
    .line 7
    const/4 v11, 0x0

    .line 8
    const/16 v12, 0x5fb

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    const/4 v3, 0x0

    .line 12
    const-string v4, ""

    .line 13
    .line 14
    const/4 v5, 0x0

    .line 15
    const/4 v6, 0x0

    .line 16
    const/4 v7, 0x0

    .line 17
    const/4 v8, 0x0

    .line 18
    const/4 v9, 0x0

    .line 19
    invoke-direct/range {v1 .. v12}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    const/4 v2, 0x0

    .line 27
    invoke-static {v1, v0, v2, v2}, La/evz;->g(Lorg/xplatform/uikit/components/dialog/DialogFields;ZZZ)La/tx00;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    return-object v0
.end method
