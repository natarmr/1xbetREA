.class public final synthetic La/me;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:D

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(DLjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, La/me;->a:Ljava/lang/String;

    iput-wide p1, p0, La/me;->b:D

    iput-object p4, p0, La/me;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    check-cast p1, Landroid/content/Context;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v0, La/tje;

    .line 7
    .line 8
    const v1, 0x7f14071f

    .line 9
    .line 10
    .line 11
    invoke-direct {v0, p1, v1}, La/tje;-><init>(Landroid/content/Context;I)V

    .line 12
    .line 13
    .line 14
    new-instance p1, Lorg/xplatform/uikit/components/account_info/DsAccountInfo;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-direct {p1, v0, v1}, Lorg/xplatform/uikit/components/account_info/DsAccountInfo;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 18
    .line 19
    .line 20
    const v0, 0x7f1300e5

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, v0}, Lorg/xplatform/uikit/components/account_info/DsAccountInfo;->setButtonText(I)V

    .line 24
    .line 25
    .line 26
    const v0, 0x7f0805be

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, v0}, Lorg/xplatform/uikit/components/account_info/DsAccountInfo;->setButtonIconRes(I)V

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, La/me;->a:Ljava/lang/String;

    .line 33
    .line 34
    invoke-virtual {p1, v0}, Lorg/xplatform/uikit/components/account_info/DsAccountInfo;->setLabel(Ljava/lang/CharSequence;)V

    .line 35
    .line 36
    .line 37
    new-instance v0, La/ke;

    .line 38
    .line 39
    sget-object v1, La/pn40;->a:La/pn40;

    .line 40
    .line 41
    const-string v1, ""

    .line 42
    .line 43
    iget-wide v2, p0, La/me;->b:D

    .line 44
    .line 45
    invoke-static {v1, v2, v3}, La/pn40;->k(Ljava/lang/String;D)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    iget-object p0, p0, La/me;->c:Ljava/lang/String;

    .line 50
    .line 51
    invoke-direct {v0, v1, p0}, La/ke;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1, v0}, Lorg/xplatform/uikit/components/account_info/DsAccountInfo;->setModel(La/ke;)V

    .line 55
    .line 56
    .line 57
    return-object p1
.end method
