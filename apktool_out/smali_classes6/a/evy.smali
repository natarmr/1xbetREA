.class public final synthetic La/evy;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/fvy;

.field public final synthetic c:La/n0x;


# direct methods
.method public synthetic constructor <init>(La/fvy;La/n0x;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/evy;->a:B

    iput-object p1, p0, La/evy;->b:La/fvy;

    iput-object p2, p0, La/evy;->c:La/n0x;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/evy;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/evy;->c:La/n0x;

    .line 4
    .line 5
    iget-object p0, p0, La/evy;->b:La/fvy;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, Landroid/graphics/drawable/Drawable;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iget-object p1, v1, La/n0x;->a:Ljava/lang/String;

    .line 16
    .line 17
    iput-object p1, p0, La/fvy;->j:Ljava/lang/String;

    .line 18
    .line 19
    :goto_0
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 20
    .line 21
    return-object p0

    .line 22
    :pswitch_0
    check-cast p1, Ljava/lang/Throwable;

    .line 23
    .line 24
    invoke-static {p0, v1}, La/fvy;->b(La/fvy;La/n0x;)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :pswitch_1
    check-cast p1, Landroid/graphics/drawable/Drawable;

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    iget-object p1, v1, La/n0x;->a:Ljava/lang/String;

    .line 34
    .line 35
    iput-object p1, p0, La/fvy;->j:Ljava/lang/String;

    .line 36
    .line 37
    goto :goto_0

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
