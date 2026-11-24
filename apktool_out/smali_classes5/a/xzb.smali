.class public final La/xzb;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/kd30;

.field public final b:La/gst0;


# direct methods
.method public constructor <init>(La/kd30;La/gst0;B)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    packed-switch p3, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/xzb;->a:La/kd30;

    .line 11
    .line 12
    iput-object p2, p0, La/xzb;->b:La/gst0;

    .line 13
    .line 14
    return-void

    .line 15
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, La/xzb;->a:La/kd30;

    .line 19
    .line 20
    iput-object p2, p0, La/xzb;->b:La/gst0;

    .line 21
    .line 22
    return-void

    .line 23
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public a(La/swp0;ZLa/zje;)Ljava/lang/Object;
    .locals 1

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    iget-object p2, p0, La/xzb;->b:La/gst0;

    .line 4
    .line 5
    invoke-virtual {p2}, La/gst0;->a()Z

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p2, 0x1

    .line 11
    :goto_0
    const-string v0, ""

    .line 12
    .line 13
    iget-object p0, p0, La/xzb;->a:La/kd30;

    .line 14
    .line 15
    invoke-virtual {p0, p3, p1, v0, p2}, La/kd30;->W(La/zje;La/swp0;Ljava/lang/String;Z)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method
