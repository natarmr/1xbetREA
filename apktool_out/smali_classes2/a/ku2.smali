.class public final La/ku2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/kwk;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/agk0;

.field public final synthetic c:La/rv2;


# direct methods
.method public synthetic constructor <init>(La/agk0;La/rv2;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/ku2;->a:B

    iput-object p1, p0, La/ku2;->b:La/agk0;

    iput-object p2, p0, La/ku2;->c:La/rv2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    iget-byte v0, p0, La/ku2;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/ku2;->c:La/rv2;

    .line 4
    .line 5
    iget-object p0, p0, La/ku2;->b:La/agk0;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v0, v1, La/rv2;->f:La/agk0;

    .line 11
    .line 12
    invoke-virtual {v0}, La/agk0;->l()F

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    invoke-virtual {p0, v0}, La/agk0;->m(F)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_0
    iget-object v0, v1, La/rv2;->f:La/agk0;

    .line 21
    .line 22
    invoke-virtual {v0}, La/agk0;->l()F

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    invoke-virtual {p0, v0}, La/agk0;->m(F)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :pswitch_1
    iget-object v0, v1, La/rv2;->f:La/agk0;

    .line 31
    .line 32
    invoke-virtual {v0}, La/agk0;->l()F

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    invoke-virtual {p0, v0}, La/agk0;->m(F)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :pswitch_2
    iget-object v0, v1, La/rv2;->f:La/agk0;

    .line 41
    .line 42
    invoke-virtual {v0}, La/agk0;->l()F

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    invoke-virtual {p0, v0}, La/agk0;->m(F)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    nop

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
