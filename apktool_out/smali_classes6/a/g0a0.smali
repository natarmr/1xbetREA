.class public final synthetic La/g0a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/pz40;

.field public final synthetic c:La/pz40;

.field public final synthetic d:La/glo0;

.field public final synthetic e:La/pz40;


# direct methods
.method public synthetic constructor <init>(La/pz40;La/pz40;La/glo0;La/pz40;B)V
    .locals 0

    .line 1
    iput-byte p5, p0, La/g0a0;->a:B

    iput-object p1, p0, La/g0a0;->b:La/pz40;

    iput-object p2, p0, La/g0a0;->c:La/pz40;

    iput-object p3, p0, La/g0a0;->d:La/glo0;

    iput-object p4, p0, La/g0a0;->e:La/pz40;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/g0a0;->a:B

    .line 2
    .line 3
    const v1, 0x7f07074a

    .line 4
    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    const/4 v3, 0x0

    .line 8
    iget-object v4, p0, La/g0a0;->e:La/pz40;

    .line 9
    .line 10
    iget-object v5, p0, La/g0a0;->d:La/glo0;

    .line 11
    .line 12
    iget-object v6, p0, La/g0a0;->c:La/pz40;

    .line 13
    .line 14
    iget-object p0, p0, La/g0a0;->b:La/pz40;

    .line 15
    .line 16
    const/4 v7, 0x0

    .line 17
    check-cast p1, Landroid/content/Context;

    .line 18
    .line 19
    packed-switch v0, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    new-instance v0, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;

    .line 26
    .line 27
    invoke-direct {v0, p1, v3, v7}, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 28
    .line 29
    .line 30
    invoke-interface {p0, v0}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    new-instance p0, La/gva;

    .line 34
    .line 35
    invoke-direct {p0, v0, v2, v1}, La/k5;-><init>(La/nmo0;ZI)V

    .line 36
    .line 37
    .line 38
    iput-object v0, p0, La/gva;->l:Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;

    .line 39
    .line 40
    invoke-virtual {v0, p0}, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;->setAdapter(La/k5;)V

    .line 41
    .line 42
    .line 43
    invoke-interface {v6, p0}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;->getHorizontalRecyclerViewListener()La/vlw;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    new-instance p1, La/h0a0;

    .line 51
    .line 52
    invoke-direct {p1, v5, v4, v7}, La/h0a0;-><init>(La/glo0;La/pz40;B)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    iput-object p1, p0, La/vlw;->h:La/xdr;

    .line 59
    .line 60
    return-object v0

    .line 61
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    new-instance v0, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;

    .line 65
    .line 66
    invoke-direct {v0, p1, v3, v7}, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 67
    .line 68
    .line 69
    const/4 p1, 0x4

    .line 70
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 71
    .line 72
    .line 73
    invoke-interface {p0, v0}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    new-instance p0, La/iu90;

    .line 77
    .line 78
    invoke-direct {p0, v0, v7, v1}, La/k5;-><init>(La/nmo0;ZI)V

    .line 79
    .line 80
    .line 81
    iput-object v0, p0, La/iu90;->l:Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;

    .line 82
    .line 83
    invoke-virtual {v0, p0}, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;->setAdapter(La/k5;)V

    .line 84
    .line 85
    .line 86
    invoke-interface {v6, p0}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0}, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;->getHorizontalRecyclerViewListener()La/vlw;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    new-instance p1, La/h0a0;

    .line 94
    .line 95
    invoke-direct {p1, v5, v4, v2}, La/h0a0;-><init>(La/glo0;La/pz40;B)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    iput-object p1, p0, La/vlw;->h:La/xdr;

    .line 102
    .line 103
    return-object v0

    .line 104
    nop

    .line 105
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
