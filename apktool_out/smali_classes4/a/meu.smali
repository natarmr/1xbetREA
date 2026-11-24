.class public final La/meu;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/h7q;


# direct methods
.method public constructor <init>(La/h7q;B)V
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
    iput-object p1, p0, La/meu;->a:La/h7q;

    .line 11
    .line 12
    return-void

    .line 13
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, La/meu;->a:La/h7q;

    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, La/meu;->a:La/h7q;

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
.method public a()V
    .locals 6

    .line 1
    iget-object p0, p0, La/meu;->a:La/h7q;

    .line 2
    .line 3
    iget-object v0, p0, La/h7q;->d:La/dev;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    sget-object v1, La/ocq;->a:La/ocq;

    .line 9
    .line 10
    iput-object v1, v0, La/dev;->a:La/ocq;

    .line 11
    .line 12
    sget-object v1, La/iun;->a:La/iun;

    .line 13
    .line 14
    iput-object v1, v0, La/dev;->b:Ljava/util/List;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    iput v2, v0, La/dev;->d:I

    .line 18
    .line 19
    iget-object v0, v0, La/dev;->c:La/p7m0;

    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    invoke-virtual {v0, v3}, La/p7m0;->n(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    iget-object p0, p0, La/h7q;->c:La/q6q;

    .line 26
    .line 27
    const/4 v0, 0x0

    .line 28
    iput v0, p0, La/q6q;->b:F

    .line 29
    .line 30
    const-wide/16 v4, 0x0

    .line 31
    .line 32
    iput-wide v4, p0, La/q6q;->c:J

    .line 33
    .line 34
    iget-object v0, p0, La/q6q;->d:La/p7m0;

    .line 35
    .line 36
    invoke-virtual {v0, v1}, La/p7m0;->n(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    iput-object v1, p0, La/q6q;->e:Ljava/util/List;

    .line 40
    .line 41
    iget-object p0, p0, La/q6q;->a:La/p7m0;

    .line 42
    .line 43
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {p0, v3, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    return-void
.end method
