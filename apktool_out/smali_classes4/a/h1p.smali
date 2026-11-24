.class public final La/h1p;
.super La/k1p;
.source "SourceFile"


# instance fields
.field public final synthetic b:B

.field public final c:Ljava/lang/Float;


# direct methods
.method public constructor <init>(FB)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/h1p;->b:B

    .line 2
    .line 3
    packed-switch p2, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    sget-object p2, La/m1p;->g:La/m1p;

    .line 11
    .line 12
    invoke-direct {p0, p2}, La/k1p;-><init>(La/m1p;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, La/h1p;->c:Ljava/lang/Float;

    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    sget-object p2, La/m1p;->i:La/m1p;

    .line 23
    .line 24
    invoke-direct {p0, p2}, La/k1p;-><init>(La/m1p;)V

    .line 25
    .line 26
    .line 27
    iput-object p1, p0, La/h1p;->c:Ljava/lang/Float;

    .line 28
    .line 29
    return-void

    .line 30
    :pswitch_1
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    sget-object p2, La/m1p;->h:La/m1p;

    .line 35
    .line 36
    invoke-direct {p0, p2}, La/k1p;-><init>(La/m1p;)V

    .line 37
    .line 38
    .line 39
    iput-object p1, p0, La/h1p;->c:Ljava/lang/Float;

    .line 40
    .line 41
    return-void

    .line 42
    nop

    .line 43
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/h1p;->b:B

    iget-object p0, p0, La/h1p;->c:Ljava/lang/Float;

    return-object p0
.end method
