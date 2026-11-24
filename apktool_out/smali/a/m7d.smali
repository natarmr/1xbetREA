.class public final synthetic La/m7d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/bmf0;

.field public final synthetic c:La/gnf0;

.field public final synthetic d:J

.field public final synthetic e:La/kft0;


# direct methods
.method public synthetic constructor <init>(La/bmf0;La/gnf0;JLa/kft0;B)V
    .locals 0

    .line 1
    iput-byte p6, p0, La/m7d;->a:B

    iput-object p1, p0, La/m7d;->b:La/bmf0;

    iput-object p2, p0, La/m7d;->c:La/gnf0;

    iput-wide p3, p0, La/m7d;->d:J

    iput-object p5, p0, La/m7d;->e:La/kft0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget-byte v0, p0, La/m7d;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/m7d;->e:La/kft0;

    .line 4
    .line 5
    iget-wide v2, p0, La/m7d;->d:J

    .line 6
    .line 7
    iget-object v4, p0, La/m7d;->c:La/gnf0;

    .line 8
    .line 9
    iget-object p0, p0, La/m7d;->b:La/bmf0;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast v1, La/pz2;

    .line 15
    .line 16
    invoke-interface {p0, v4, v2, v3, v1}, La/bmf0;->c(La/gnf0;JLa/pz2;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_0
    check-cast v1, La/qmf0;

    .line 21
    .line 22
    invoke-interface {p0, v4, v2, v3, v1}, La/bmf0;->w(La/gnf0;JLa/qmf0;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
