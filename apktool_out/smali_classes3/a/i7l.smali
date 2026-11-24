.class public final synthetic La/i7l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/j7l;


# direct methods
.method public synthetic constructor <init>(La/j7l;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/i7l;->a:B

    iput-object p1, p0, La/i7l;->b:La/j7l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/i7l;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/i7l;->b:La/j7l;

    .line 4
    .line 5
    check-cast p1, Ljava/lang/Integer;

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    check-cast p2, Ljava/lang/Integer;

    .line 12
    .line 13
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    check-cast p3, Ljava/lang/Integer;

    .line 18
    .line 19
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 20
    .line 21
    .line 22
    move-result p3

    .line 23
    check-cast p4, Ljava/lang/Integer;

    .line 24
    .line 25
    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    .line 26
    .line 27
    .line 28
    move-result p4

    .line 29
    packed-switch v0, :pswitch_data_0

    .line 30
    .line 31
    .line 32
    iget-object p0, p0, La/j7l;->i:Lorg/xplatform/cyber/dota/impl/presentation/common/DotaAdditionalTeamInformationView;

    .line 33
    .line 34
    invoke-virtual {p0, p1, p2, p3, p4}, Landroid/view/View;->layout(IIII)V

    .line 35
    .line 36
    .line 37
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 38
    .line 39
    return-object p0

    .line 40
    :pswitch_0
    invoke-static {p0, p1, p2, p3, p4}, La/j7l;->a(La/j7l;IIII)Lkotlin/Unit;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
