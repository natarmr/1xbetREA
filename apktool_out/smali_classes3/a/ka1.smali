.class public final La/ka1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/hb50;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/sgy;

.field public final synthetic c:La/jiy;


# direct methods
.method public synthetic constructor <init>(La/sgy;La/jiy;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/ka1;->a:B

    iput-object p1, p0, La/ka1;->b:La/sgy;

    iput-object p2, p0, La/ka1;->c:La/jiy;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(La/nw20;)V
    .locals 2

    .line 1
    iget-byte v0, p0, La/ka1;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/ka1;->c:La/jiy;

    .line 4
    .line 5
    iget-object p0, p0, La/ka1;->b:La/sgy;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1, p0, v1}, La/nw20;->s(La/sgy;La/jiy;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    invoke-virtual {p1, p0, v1}, La/nw20;->s(La/sgy;La/jiy;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_1
    invoke-virtual {p1, p0, v1}, La/nw20;->s(La/sgy;La/jiy;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_2
    invoke-virtual {p1, p0, v1}, La/nw20;->s(La/sgy;La/jiy;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_3
    invoke-virtual {p1, p0, v1}, La/nw20;->s(La/sgy;La/jiy;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :pswitch_4
    invoke-virtual {p1, p0, v1}, La/nw20;->s(La/sgy;La/jiy;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :pswitch_5
    invoke-virtual {p1, p0, v1}, La/nw20;->s(La/sgy;La/jiy;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b(La/phf0;)V
    .locals 1

    .line 1
    iget-byte v0, p0, La/ka1;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/ka1;->b:La/sgy;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, La/bsr0;->e:La/ugd;

    .line 9
    .line 10
    invoke-static {p1, p0, v0}, La/phf0;->b(La/phf0;La/sgy;La/ugd;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    sget-object v0, La/knx;->e:La/ugd;

    .line 15
    .line 16
    invoke-static {p1, p0, v0}, La/phf0;->b(La/phf0;La/sgy;La/ugd;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_1
    sget-object v0, La/saj;->b:La/ugd;

    .line 21
    .line 22
    invoke-static {p1, p0, v0}, La/phf0;->b(La/phf0;La/sgy;La/ugd;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_2
    sget-object v0, La/saj;->c:La/ugd;

    .line 27
    .line 28
    invoke-static {p1, p0, v0}, La/phf0;->b(La/phf0;La/sgy;La/ugd;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :pswitch_3
    sget-object v0, La/ccq0;->c:La/ugd;

    .line 33
    .line 34
    invoke-static {p1, p0, v0}, La/phf0;->b(La/phf0;La/sgy;La/ugd;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :pswitch_4
    sget-object v0, La/unh0;->b:La/ugd;

    .line 39
    .line 40
    invoke-static {p1, p0, v0}, La/phf0;->b(La/phf0;La/sgy;La/ugd;)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :pswitch_5
    sget-object v0, La/rsr0;->a:La/ugd;

    .line 45
    .line 46
    invoke-static {p1, p0, v0}, La/phf0;->b(La/phf0;La/sgy;La/ugd;)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    nop

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
