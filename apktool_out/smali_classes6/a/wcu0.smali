.class public final La/wcu0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/yfu0;


# instance fields
.field public final synthetic a:B

.field public final b:Landroid/widget/LinearLayout;

.field public final c:Landroid/widget/TextView;

.field public final d:Landroid/widget/TextView;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/LinearLayout;Landroid/widget/TextView;Landroid/widget/TextView;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/wcu0;->a:B

    iput-object p1, p0, La/wcu0;->b:Landroid/widget/LinearLayout;

    iput-object p2, p0, La/wcu0;->c:Landroid/widget/TextView;

    iput-object p3, p0, La/wcu0;->d:Landroid/widget/TextView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getRoot()Landroid/view/View;
    .locals 1

    .line 1
    iget-byte v0, p0, La/wcu0;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, La/wcu0;->b:Landroid/widget/LinearLayout;

    .line 7
    .line 8
    return-object p0

    .line 9
    :pswitch_0
    iget-object p0, p0, La/wcu0;->b:Landroid/widget/LinearLayout;

    .line 10
    .line 11
    return-object p0

    .line 12
    nop

    .line 13
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
