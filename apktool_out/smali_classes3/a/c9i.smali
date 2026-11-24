.class public final La/c9i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p0h0;


# instance fields
.field public final synthetic a:La/n8i;


# direct methods
.method public constructor <init>(La/n8i;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/c9i;->a:La/n8i;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 3

    .line 1
    new-instance v0, La/cq4;

    .line 2
    .line 3
    iget-object p0, p0, La/c9i;->a:La/n8i;

    .line 4
    .line 5
    iget-object p0, p0, La/n8i;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/d9i;

    .line 8
    .line 9
    iget-object v1, p0, La/d9i;->a:La/mne;

    .line 10
    .line 11
    iget-object v2, p0, La/d9i;->b:La/ctf0;

    .line 12
    .line 13
    iget-object p0, p0, La/d9i;->c:Lorg/xplatform/authenticator/impl/ui/dialogs/authenticator_filter/models/AuthenticatorFilterDialogSettings;

    .line 14
    .line 15
    invoke-direct {v0, p1, v1, v2, p0}, La/cq4;-><init>(La/vzg0;La/mne;La/ctf0;Lorg/xplatform/authenticator/impl/ui/dialogs/authenticator_filter/models/AuthenticatorFilterDialogSettings;)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method
