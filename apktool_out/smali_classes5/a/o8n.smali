.class public final synthetic La/o8n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/w03;

.field public final synthetic c:La/ucs0;

.field public final synthetic d:La/ucs0;


# direct methods
.method public synthetic constructor <init>(La/w03;La/ucs0;La/ucs0;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/o8n;->a:B

    iput-object p1, p0, La/o8n;->b:La/w03;

    iput-object p2, p0, La/o8n;->c:La/ucs0;

    iput-object p3, p0, La/o8n;->d:La/ucs0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/o8n;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/o8n;->d:La/ucs0;

    .line 4
    .line 5
    iget-object v2, p0, La/o8n;->c:La/ucs0;

    .line 6
    .line 7
    iget-object p0, p0, La/o8n;->b:La/w03;

    .line 8
    .line 9
    check-cast p1, La/g7z;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    iget-object p1, p1, La/g7z;->a:La/a6a;

    .line 18
    .line 19
    iget-object p1, p1, La/a6a;->b:La/nr;

    .line 20
    .line 21
    invoke-virtual {p1}, La/nr;->i()La/x5a;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    new-instance v0, La/ne80;

    .line 26
    .line 27
    invoke-direct {v0, p0}, La/ne80;-><init>(La/w03;)V

    .line 28
    .line 29
    .line 30
    invoke-static {p1, v0, v2}, La/z1x;->D(La/x5a;La/ne80;La/ucs0;)V

    .line 31
    .line 32
    .line 33
    new-instance v0, La/ne80;

    .line 34
    .line 35
    invoke-direct {v0, p0}, La/ne80;-><init>(La/w03;)V

    .line 36
    .line 37
    .line 38
    invoke-static {p1, v0, v1}, La/z1x;->D(La/x5a;La/ne80;La/ucs0;)V

    .line 39
    .line 40
    .line 41
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 42
    .line 43
    return-object p0

    .line 44
    :pswitch_0
    iget-object p1, p1, La/g7z;->a:La/a6a;

    .line 45
    .line 46
    iget-object p1, p1, La/a6a;->b:La/nr;

    .line 47
    .line 48
    invoke-virtual {p1}, La/nr;->i()La/x5a;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    new-instance v0, La/ne80;

    .line 53
    .line 54
    invoke-direct {v0, p0}, La/ne80;-><init>(La/w03;)V

    .line 55
    .line 56
    .line 57
    invoke-static {p1, v0, v2}, La/z1x;->D(La/x5a;La/ne80;La/ucs0;)V

    .line 58
    .line 59
    .line 60
    new-instance v0, La/ne80;

    .line 61
    .line 62
    invoke-direct {v0, p0}, La/ne80;-><init>(La/w03;)V

    .line 63
    .line 64
    .line 65
    invoke-static {p1, v0, v1}, La/z1x;->D(La/x5a;La/ne80;La/ucs0;)V

    .line 66
    .line 67
    .line 68
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 69
    .line 70
    return-object p0

    .line 71
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
