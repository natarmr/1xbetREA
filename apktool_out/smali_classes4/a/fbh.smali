.class public final La/fbh;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/kwk;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ujd;

.field public final synthetic c:Landroidx/fragment/app/Fragment;


# direct methods
.method public synthetic constructor <init>(La/ujd;Landroidx/fragment/app/Fragment;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/fbh;->a:B

    iput-object p1, p0, La/fbh;->b:La/ujd;

    iput-object p2, p0, La/fbh;->c:Landroidx/fragment/app/Fragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    iget-byte v0, p0, La/fbh;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/fbh;->c:Landroidx/fragment/app/Fragment;

    .line 4
    .line 5
    iget-object p0, p0, La/fbh;->b:La/ujd;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-static {v1}, La/ujd;->a(Landroidx/fragment/app/Fragment;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :pswitch_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-static {v1}, La/ujd;->a(Landroidx/fragment/app/Fragment;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
