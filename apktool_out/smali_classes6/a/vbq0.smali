.class public final synthetic La/vbq0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/xbq0;


# direct methods
.method public synthetic constructor <init>(La/xbq0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/vbq0;->a:B

    iput-object p1, p0, La/vbq0;->b:La/xbq0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 1

    .line 1
    iget-byte v0, p0, La/vbq0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/vbq0;->b:La/xbq0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, La/xbq0;->O1:La/m6m0;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    if-eqz p2, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, La/xbq0;->K0()La/zbq0;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p0}, La/zbq0;->z()V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void

    .line 23
    :pswitch_0
    sget-object v0, La/xbq0;->O1:La/m6m0;

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    if-eqz p2, :cond_1

    .line 29
    .line 30
    invoke-virtual {p0}, La/xbq0;->K0()La/zbq0;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-virtual {p0}, La/zbq0;->x()V

    .line 35
    .line 36
    .line 37
    :cond_1
    return-void

    .line 38
    :pswitch_1
    sget-object v0, La/xbq0;->O1:La/m6m0;

    .line 39
    .line 40
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    if-eqz p2, :cond_2

    .line 44
    .line 45
    invoke-virtual {p0}, La/xbq0;->K0()La/zbq0;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-virtual {p0}, La/zbq0;->y()V

    .line 50
    .line 51
    .line 52
    :cond_2
    return-void

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
