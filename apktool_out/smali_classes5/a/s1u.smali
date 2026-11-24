.class public final La/s1u;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/kym0;


# direct methods
.method public constructor <init>(La/kym0;B)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    packed-switch p2, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/s1u;->a:La/kym0;

    .line 11
    .line 12
    return-void

    .line 13
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, La/s1u;->a:La/kym0;

    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, La/s1u;->a:La/kym0;

    .line 23
    .line 24
    return-void

    .line 25
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public a()La/i89;
    .locals 2

    .line 1
    iget-object p0, p0, La/s1u;->a:La/kym0;

    .line 2
    .line 3
    iget-object p0, p0, La/kym0;->a:La/jym0;

    .line 4
    .line 5
    iget-object p0, p0, La/jym0;->a:La/p7m0;

    .line 6
    .line 7
    new-instance v0, La/i89;

    .line 8
    .line 9
    const/16 v1, 0x16

    .line 10
    .line 11
    invoke-direct {v0, p0, v1}, La/i89;-><init>(La/gmq;B)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method
