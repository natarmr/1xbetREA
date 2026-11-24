.class public final synthetic La/z5j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/pru;

.field public final synthetic c:La/bzt;


# direct methods
.method public synthetic constructor <init>(La/pru;La/bzt;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/z5j;->a:B

    iput-object p1, p0, La/z5j;->b:La/pru;

    iput-object p2, p0, La/z5j;->c:La/bzt;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/z5j;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/z5j;->c:La/bzt;

    .line 4
    .line 5
    iget-object p0, p0, La/z5j;->b:La/pru;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance v2, La/f2k0;

    .line 11
    .line 12
    sget-object v6, La/ui5;->a:La/ui5;

    .line 13
    .line 14
    invoke-virtual {p0}, La/pru;->a()La/sff0;

    .line 15
    .line 16
    .line 17
    move-result-object v9

    .line 18
    iget-object p0, v1, La/bzt;->a:La/fsd;

    .line 19
    .line 20
    invoke-virtual {p0}, La/fsd;->a()La/v8d;

    .line 21
    .line 22
    .line 23
    move-result-object v10

    .line 24
    const/4 v3, 0x0

    .line 25
    const/4 v4, 0x0

    .line 26
    sget-object v5, La/ygs0;->a:La/ygs0;

    .line 27
    .line 28
    const/4 v7, 0x0

    .line 29
    const/16 v8, 0xa

    .line 30
    .line 31
    invoke-direct/range {v2 .. v10}, La/f2k0;-><init>(La/ql5;La/ik5;La/zgs0;La/ui5;ZILa/sff0;La/v8d;)V

    .line 32
    .line 33
    .line 34
    return-object v2

    .line 35
    :pswitch_0
    sget-object v5, La/bm5;->e:La/bm5;

    .line 36
    .line 37
    invoke-virtual {p0}, La/pru;->a()La/sff0;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    iget-object p0, p0, La/sff0;->b:La/hl1;

    .line 42
    .line 43
    iget-boolean v8, p0, La/hl1;->z:Z

    .line 44
    .line 45
    iget-object p0, v1, La/bzt;->a:La/fsd;

    .line 46
    .line 47
    invoke-virtual {p0}, La/fsd;->a()La/v8d;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    iget v4, p0, La/v8d;->r:I

    .line 52
    .line 53
    new-instance v3, La/w5j;

    .line 54
    .line 55
    const/4 v7, 0x1

    .line 56
    const/4 v10, 0x0

    .line 57
    const/4 v6, 0x1

    .line 58
    sget-object v9, La/h6j;->a:La/h6j;

    .line 59
    .line 60
    invoke-direct/range {v3 .. v10}, La/w5j;-><init>(ILa/bm5;ZZZLa/i6j;Ljava/util/List;)V

    .line 61
    .line 62
    .line 63
    return-object v3

    .line 64
    nop

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
