.class public final La/qzt;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/pru;


# direct methods
.method public constructor <init>(La/pru;B)V
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
    iput-object p1, p0, La/qzt;->a:La/pru;

    .line 11
    .line 12
    return-void

    .line 13
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, La/qzt;->a:La/pru;

    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public a()La/eme;
    .locals 0

    .line 1
    iget-object p0, p0, La/qzt;->a:La/pru;

    .line 2
    .line 3
    invoke-virtual {p0}, La/pru;->a()La/sff0;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    iget-object p0, p0, La/sff0;->g:La/mum0;

    .line 8
    .line 9
    iget-object p0, p0, La/mum0;->t:La/llm0;

    .line 10
    .line 11
    invoke-static {p0}, La/fxb;->J(La/llm0;)La/eme;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method
