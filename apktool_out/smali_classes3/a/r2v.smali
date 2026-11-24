.class public final La/r2v;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/j9s0;


# direct methods
.method public constructor <init>(La/j9s0;B)V
    .locals 0

    .line 1
    packed-switch p2, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/r2v;->a:La/j9s0;

    .line 11
    .line 12
    return-void

    .line 13
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, La/r2v;->a:La/j9s0;

    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, La/r2v;->a:La/j9s0;

    .line 26
    .line 27
    return-void

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public a(J)La/o7s0;
    .locals 2

    .line 1
    iget-object p0, p0, La/r2v;->a:La/j9s0;

    .line 2
    .line 3
    iget-object p0, p0, La/j9s0;->d:La/r9s0;

    .line 4
    .line 5
    iget-object p0, p0, La/r9s0;->a:La/p7m0;

    .line 6
    .line 7
    invoke-static {p0}, La/vtb;->N(La/qz40;)La/xae0;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    new-instance v0, La/o7s0;

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    invoke-direct {v0, p0, p1, p2, v1}, La/o7s0;-><init>(La/xae0;JB)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method
